package com.server.backendsalesapp.repositories;

import com.server.backendsalesapp.models.Ville;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VilleRepository extends JpaRepository<Ville, Integer> {
}
