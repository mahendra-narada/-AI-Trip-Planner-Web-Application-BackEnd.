package edu.icet.repository;

import edu.icet.Entity.NormalUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NormalUserRepository extends JpaRepository<NormalUser,Integer> {

    boolean existsByEmail(String email);
    NormalUser findByEmail(String email);

}
