package com.server.backendsalesapp.repositories;

import com.server.backendsalesapp.models.Adresse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdresseRepository extends JpaRepository<Adresse, Integer> {
}
