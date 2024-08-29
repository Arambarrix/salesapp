package com.server.backendsalesapp.repositories;

import com.server.backendsalesapp.models.CompteClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompteClientRepository extends JpaRepository<CompteClient, Integer> {
}
