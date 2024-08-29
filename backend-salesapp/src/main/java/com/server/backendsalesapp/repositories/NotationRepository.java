package com.server.backendsalesapp.repositories;

import com.server.backendsalesapp.models.Notation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotationRepository extends JpaRepository<Notation, Integer> {
}
