package com.server.backendsalesapp.repositories;

import com.server.backendsalesapp.models.LigneCommande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LigneCommandeRepository extends JpaRepository<LigneCommande, Integer> {
}
