package edu.icet.service.impl;


import edu.icet.Entity.Booking;
import edu.icet.repository.BookingRepository;
import edu.icet.service.BookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BookingServiceImpl implements BookingService {

    final BookingRepository bookingRepository;

    @Override
    public List<Booking> getAll() {
        return bookingRepository.findAll();
    }

    @Override
    public void add(Booking booking) {
        bookingRepository.save(booking);
    }
}
