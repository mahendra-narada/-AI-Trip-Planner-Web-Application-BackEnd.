package edu.icet.service.impl;

import edu.icet.Entity.Trip;
import edu.icet.repository.TripRepository;
import edu.icet.service.TripService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TripServiceImpl implements TripService {

    final TripRepository tripRepository;

    @Override
    public void add(Trip trip) {
        tripRepository.save(trip);
    }

    @Override
    public List<Trip> getById(int id) {
        return tripRepository.findByUserId(id);
    }


}
