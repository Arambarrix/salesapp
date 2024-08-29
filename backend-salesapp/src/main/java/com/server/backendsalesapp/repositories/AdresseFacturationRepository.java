package com.server.backendsalesapp.repositories;

import com.server.backendsalesapp.models.AdresseFacturation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdresseFacturationRepository extends JpaRepository<AdresseFacturation, Integer> {
}
