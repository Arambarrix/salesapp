package com.server.backendsalesapp.repositories;

import com.server.backendsalesapp.models.Pays;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaysRepository extends JpaRepository<Pays, Integer> {
}
