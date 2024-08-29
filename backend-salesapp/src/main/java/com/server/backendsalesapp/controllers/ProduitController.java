package com.server.backendsalesapp.controllers;

import com.server.backendsalesapp.dto.ProduitDTO;
import com.server.backendsalesapp.mappers.ProduitMapper;
import com.server.backendsalesapp.services.ProduitService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@AllArgsConstructor
@RequestMapping("/produits")
public class ProduitController {
    private final ProduitService produitService;

    @PostMapping
    public ResponseEntity<ProduitDTO> saveProduit(@RequestBody ProduitDTO produitDTO) {
        return new ResponseEntity<>(ProduitMapper.INSTANCE.toDTO(produitService.save(ProduitMapper.INSTANCE.toEntity(produitDTO))), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProduitDTO> fetchProduit(@PathVariable("id") Integer id) {
        return new ResponseEntity<>(ProduitMapper.INSTANCE.toDTO(produitService.findById(id)), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<ProduitDTO>> fetchListProduit(@RequestParam(value = "limit", required = false) Integer limit, @RequestParam(value = "page", required = false) Integer page) {
        return new ResponseEntity<>(ProduitMapper.INSTANCE.toListDTO(produitService.findAll(limit, page)), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProduitDTO> updateProduit(@PathVariable("id") Integer id, @RequestBody ProduitDTO produitDTO) {
        return new ResponseEntity<>(ProduitMapper.INSTANCE.toDTO(produitService.update(id, ProduitMapper.INSTANCE.toEntity(produitDTO))), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProduit(@PathVariable("id") Integer id) {
        produitService.deleteById(id);
        return new ResponseEntity<>("Donnée supprimée", HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<String> deleteAllProduit() {
        produitService.deleteAll();
        return new ResponseEntity<>("Données supprimées", HttpStatus.OK);
    }
}
