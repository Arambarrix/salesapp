package com.server.backendsalesapp.repositories;

import com.server.backendsalesapp.models.Magasin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MagasinRepository extends JpaRepository<Magasin, Integer> {
}
