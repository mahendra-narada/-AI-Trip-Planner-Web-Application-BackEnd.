package edu.icet.service;

import edu.icet.Entity.Trip;

import java.util.List;

public interface TripService {

    public void add(Trip trip);

    List<Trip> getById(int id);
}
