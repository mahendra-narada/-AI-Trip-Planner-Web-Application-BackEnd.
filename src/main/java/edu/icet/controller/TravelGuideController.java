package edu.icet.controller;

import edu.icet.Entity.TravelGuide;
import edu.icet.service.TravelGuideService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Guide")
@RequiredArgsConstructor
@CrossOrigin
public class TravelGuideController {


    final TravelGuideService travelGuideService;

    @GetMapping("/all")
    public List<TravelGuide> getAll() {
        return travelGuideService.getAll();
    }

    @PostMapping("/add")
    public ResponseEntity<TravelGuide> add(@RequestBody TravelGuide travelGuide){
        travelGuideService.add(travelGuide);
        return ResponseEntity.ok(travelGuide);
    }

    @GetMapping("/byLocation")
    public List<TravelGuide> getByLocation(@RequestParam String location){
        return travelGuideService.getBasedOntheLocation(location);
    }

    @GetMapping("/byDate")
    public List<TravelGuide> getByBookingDate(@RequestParam LocalDate date){
        return travelGuideService.getBasedOnBookingDate(date);
    }

    @GetMapping("/byDateAndLocation")
    public List<TravelGuide> getOnlyGuideForTrip(
            @RequestParam String Location ,
            @RequestParam LocalDate date){
        return travelGuideService.findAvailableGuidesByLocationAndDate(Location,date);
    }

    @GetMapping("/byId")
    public Optional<TravelGuide> getBasedOnId(@RequestParam int guideId) {
        return travelGuideService.getGuideById(guideId);
    }









}
