package edu.icet.repository;


import edu.icet.Entity.Trip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TripRepository extends JpaRepository<Trip,Integer> {
    List<Trip> findByUserId(int userId);
}
