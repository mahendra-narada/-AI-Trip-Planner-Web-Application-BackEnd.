package edu.icet.service;

import edu.icet.Entity.Location;

import java.util.List;

public interface LocationService {

    public List<Location> getAll();
    public void add(Location location);
}
