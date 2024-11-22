package edu.icet.service;

import edu.icet.Entity.Booking;

import java.util.List;

public interface BookingService {

    public List<Booking> getAll();
    public void add(Booking booking);
}
