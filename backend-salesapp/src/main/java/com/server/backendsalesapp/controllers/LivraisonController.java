package com.server.backendsalesapp.controllers;

import com.server.backendsalesapp.dto.LivraisonDTO;
import com.server.backendsalesapp.mappers.LivraisonMapper;
import com.server.backendsalesapp.services.LivraisonService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@AllArgsConstructor
@RequestMapping("/livraisons")
public class LivraisonController {
    private final LivraisonService livraisonService;

    @PostMapping
    public ResponseEntity<LivraisonDTO> saveLivraison(@RequestBody LivraisonDTO livraisonDTO) {
        return new ResponseEntity<>(LivraisonMapper.INSTANCE.toDTO(livraisonService.save(LivraisonMapper.INSTANCE.toEntity(livraisonDTO))), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<LivraisonDTO> fetchLivraison(@PathVariable("id") Integer id) {
        return new ResponseEntity<>(LivraisonMapper.INSTANCE.toDTO(livraisonService.findById(id)), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<LivraisonDTO>> fetchListLivraison(@RequestParam(value = "limit", required = false) Integer limit, @RequestParam(value = "page", required = false) Integer page) {
        return new ResponseEntity<>(LivraisonMapper.INSTANCE.toListDTO(livraisonService.findAll(limit, page)), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<LivraisonDTO> updateLivraison(@PathVariable("id") Integer id, @RequestBody LivraisonDTO livraisonDTO) {
        return new ResponseEntity<>(LivraisonMapper.INSTANCE.toDTO(livraisonService.update(id, LivraisonMapper.INSTANCE.toEntity(livraisonDTO))), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteLivraison(@PathVariable("id") Integer id) {
        livraisonService.deleteById(id);
        return new ResponseEntity<>("Donnée supprimée", HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<String> deleteAllLivraison() {
        livraisonService.deleteAll();
        return new ResponseEntity<>("Données supprimées", HttpStatus.OK);
    }
}
