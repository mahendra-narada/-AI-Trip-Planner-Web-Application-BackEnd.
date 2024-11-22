package edu.icet.controller;

import edu.icet.Entity.Booking;
import edu.icet.service.BookingService;
import lombok.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Booking")
@RequiredArgsConstructor
@CrossOrigin
public class BookingController {


    final BookingService bookingService;

    @GetMapping("/all")
    public List<Booking> getAll() {
        return bookingService.getAll();
    }

    @PostMapping("/add")
    public ResponseEntity<Booking> add(@RequestBody Booking booking){
        bookingService.add(booking);
        return ResponseEntity.ok(booking);
    }



}
