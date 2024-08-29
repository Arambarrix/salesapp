package com.server.backendsalesapp.repositories;

import com.server.backendsalesapp.models.AdresseLivraison;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdresseLivraisonRepository extends JpaRepository<AdresseLivraison, Integer> {
}
