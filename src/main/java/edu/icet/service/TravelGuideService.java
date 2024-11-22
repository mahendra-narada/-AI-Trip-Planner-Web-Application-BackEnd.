package edu.icet.service;

import edu.icet.Entity.TravelGuide;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface TravelGuideService {
    public List<TravelGuide> getAll();
    public void add(TravelGuide travelGuide);
    public List<TravelGuide> getBasedOntheLocation(String location);
    List<TravelGuide> getBasedOnBookingDate(LocalDate date);
    List<TravelGuide> findAvailableGuidesByLocationAndDate(String Location, LocalDate date);
    Optional<TravelGuide> getGuideById(int guideId);
}
