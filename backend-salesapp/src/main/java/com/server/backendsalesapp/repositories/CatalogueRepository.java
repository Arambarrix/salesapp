package com.server.backendsalesapp.repositories;

import com.server.backendsalesapp.models.Catalogue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatalogueRepository extends JpaRepository<Catalogue, Integer> {
}
