package edu.icet.repository;

import edu.icet.Entity.TravelGuide;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface TravelGuideRepository extends JpaRepository<TravelGuide,Integer> {

    @Query("SELECT g FROM TravelGuide g JOIN g.locations l WHERE l = :location")
    List<TravelGuide> findGuidesByLocation(@Param("location") String location);

    @Query("SELECT g FROM TravelGuide g WHERE g.guideId NOT IN " +
            "(SELECT b.guideId FROM Booking b WHERE b.tripDate = :tripDate)")
    List<TravelGuide> findAvailableGuidesByTripDate(@Param("tripDate") LocalDate tripDate);

    @Query("""
    SELECT g 
    FROM TravelGuide g 
    JOIN g.locations l 
    WHERE l = :location 
      AND g.guideId NOT IN (
          SELECT b.guideId 
          FROM Booking b 
          WHERE b.tripDate = :tripDate
      )
""")
    List<TravelGuide> findAvailableGuidesByLocationAndDate(
            @Param("location") String location,
            @Param("tripDate") LocalDate tripDate
    );

}
