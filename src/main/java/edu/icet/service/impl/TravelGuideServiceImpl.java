package edu.icet.service.impl;

import edu.icet.Entity.TravelGuide;
import edu.icet.repository.TravelGuideRepository;
import edu.icet.service.TravelGuideService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TravelGuideServiceImpl implements TravelGuideService {


    final TravelGuideRepository travelGuideRepository;



    @Override
    public List<TravelGuide> getAll() {
       List<edu.icet.Entity.TravelGuide> travelGuideEntities = travelGuideRepository.findAll();
       return travelGuideEntities;

    }

    @Override
    public void add(TravelGuide travelGuide) {
        travelGuideRepository.save(travelGuide);
    }

    @Override
    public List<TravelGuide> getBasedOntheLocation(String location) {
        List<edu.icet.Entity.TravelGuide> travelGuideEntities = travelGuideRepository.findGuidesByLocation(location);
        return travelGuideEntities;
    }

    @Override
    public List<TravelGuide> getBasedOnBookingDate(LocalDate date) {
        List<edu.icet.Entity.TravelGuide> travelGuideEntities = travelGuideRepository.findAvailableGuidesByTripDate(date);
        return travelGuideEntities;
    }

    @Override
    public List<TravelGuide> findAvailableGuidesByLocationAndDate(String Location, LocalDate date) {
        List<edu.icet.Entity.TravelGuide> travelGuideEntities = travelGuideRepository.findAvailableGuidesByLocationAndDate(Location,date);
        return travelGuideEntities;
    }

    @Override
    public Optional<TravelGuide> getGuideById(int guideId) {
        return travelGuideRepository.findById(guideId);
    }


}
