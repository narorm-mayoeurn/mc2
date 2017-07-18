package edu.mum.ea.aop;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.aop.ThrowsAdvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Component;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * Created by nm on 18/7/17.
 */
@Aspect
@Component
public class ExceptionEmailNotification implements ThrowsAdvice {

    @Autowired
    private MailSender mailSender;

    @Value("${admin.mail.username}")
    private String email;

    @AfterThrowing(pointcut="execution(* edu.mum.ea..* (..))", throwing="throwable")
    public void afterThrowing(Throwable throwable) {

        StringWriter sw = new StringWriter();
        throwable.printStackTrace(new PrintWriter(sw));

        SimpleMailMessage message = new SimpleMailMessage();
        message.setSubject("MC2 - Exception Notification - " + throwable.toString());
        message.setFrom(email);
        message.setTo(email);
        message.setText(sw.toString());
        mailSender.send(message);
    }
}
