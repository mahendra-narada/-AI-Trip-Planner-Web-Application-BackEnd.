package edu.icet.controller;

import edu.icet.Entity.Trip;
import edu.icet.service.TripService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/Trip")
@CrossOrigin
@RequiredArgsConstructor
public class TripController {

    final TripService tripService;


    @PostMapping("/add")
    public ResponseEntity<Trip> add(@RequestBody Trip trip){
        tripService.add(trip);
        return ResponseEntity.ok(trip);
    }

    @GetMapping("/getById")
    public List<Trip> getTripById(@RequestParam int id) {
       return tripService.getById(id);
    }



}
