package edu.icet.service.impl;

import edu.icet.Entity.Location;
import edu.icet.repository.LocationRepository;
import edu.icet.service.LocationService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class LocationServiceImpl implements LocationService {

    final LocationRepository locationRepository;



    @Override
    public List<Location> getAll() {
        List<edu.icet.Entity.Location> locationList = locationRepository.findAll();
        return locationList;
    }

    @Override
    public void add(Location location) {

        locationRepository.save(location);

    }
}
