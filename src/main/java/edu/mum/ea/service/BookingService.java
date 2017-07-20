package edu.mum.ea.service;

import edu.mum.ea.domain.Booking;
import edu.mum.ea.domain.User;
import org.springframework.amqp.rabbit.core.RabbitTemplate;

/**
 * Created by darith on 7/18/17.
 */
public interface BookingService {

    public Booking findById(Long id);
    public void save(Booking booking);

    public void publish(RabbitTemplate rabbitTemplate, User user);
}
