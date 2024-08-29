package com.server.backendsalesapp.repositories;

import com.server.backendsalesapp.models.Stockage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockageRepository extends JpaRepository<Stockage, Integer> {
}
