package edu.icet.controller;


import edu.icet.Entity.Location;
import edu.icet.service.LocationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Location")
@RequiredArgsConstructor
@CrossOrigin
public class LocationController {

    final LocationService locationService;

    @GetMapping("/all")
    public List<Location> getAll()
    {
        return locationService.getAll();
    }

    @PostMapping("/add")
    public ResponseEntity<Location> add(@RequestBody Location location){
        locationService.add(location);
        return ResponseEntity.ok(location);
    }
}

