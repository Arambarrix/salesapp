package com.server.backendsalesapp.repositories;

import com.server.backendsalesapp.models.CompteEmploye;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompteEmployeRepository extends JpaRepository<CompteEmploye, Integer> {
}
