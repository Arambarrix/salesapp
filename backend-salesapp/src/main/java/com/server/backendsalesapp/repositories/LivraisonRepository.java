package com.server.backendsalesapp.repositories;

import com.server.backendsalesapp.models.Livraison;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivraisonRepository extends JpaRepository<Livraison, Integer> {
}
