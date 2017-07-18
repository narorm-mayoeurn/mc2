package edu.mum.ea.service.impl;

import edu.mum.ea.dao.BookingDao;
import edu.mum.ea.domain.Booking;
import edu.mum.ea.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by darith on 7/18/17.
 */
public class BookingServiceImpl implements BookingService {

    @Autowired
    private BookingDao bookingDao;

    public Booking findById(Long id) {
        return bookingDao.findOne(id);
    }
}
