package com.server.backendsalesapp.repositories;

import com.server.backendsalesapp.models.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandeRepository extends JpaRepository<Commande, String> {
}
