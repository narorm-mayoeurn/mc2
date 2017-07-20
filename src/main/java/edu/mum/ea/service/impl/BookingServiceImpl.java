package edu.mum.ea.service.impl;

import edu.mum.ea.dao.BookingDao;
import edu.mum.ea.domain.Booking;
import edu.mum.ea.domain.User;
import edu.mum.ea.service.BookingService;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by darith on 7/18/17.
 */

@Service
@Transactional
public class BookingServiceImpl implements BookingService {

    @Autowired
    private BookingDao bookingDao;


    public Booking findById(Long id) {
        return bookingDao.findOne(id);
    }

    public void save(Booking booking) {
        bookingDao.save(booking);
    }


    @Override
    public void publish(RabbitTemplate rabbitTemplate, User user) {
        rabbitTemplate.convertAndSend("booking.key", user);
    }
}
