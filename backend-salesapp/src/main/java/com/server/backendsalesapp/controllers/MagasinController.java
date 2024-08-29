package com.server.backendsalesapp.controllers;

import com.server.backendsalesapp.dto.MagasinDTO;
import com.server.backendsalesapp.mappers.MagasinMapper;
import com.server.backendsalesapp.services.MagasinService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@AllArgsConstructor
@RequestMapping("/magasins")
public class MagasinController {
    private final MagasinService magasinService;

    @PostMapping
    public ResponseEntity<MagasinDTO> saveMagasin(@RequestBody MagasinDTO magasinDTO) {
        return new ResponseEntity<>(MagasinMapper.INSTANCE.toDTO(magasinService.save(MagasinMapper.INSTANCE.toEntity(magasinDTO))), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MagasinDTO> fetchMagasin(@PathVariable("id") Integer id) {
        return new ResponseEntity<>(MagasinMapper.INSTANCE.toDTO(magasinService.findById(id)), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<MagasinDTO>> fetchListMagasin(@RequestParam(value = "limit", required = false) Integer limit, @RequestParam(value = "page", required = false) Integer page) {
        return new ResponseEntity<>(MagasinMapper.INSTANCE.toListDTO(magasinService.findAll(limit, page)), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<MagasinDTO> updateMagasin(@PathVariable("id") Integer id, @RequestBody MagasinDTO magasinDTO) {
        return new ResponseEntity<>(MagasinMapper.INSTANCE.toDTO(magasinService.update(id, MagasinMapper.INSTANCE.toEntity(magasinDTO))), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteMagasin(@PathVariable("id") Integer id) {
        magasinService.deleteById(id);
        return new ResponseEntity<>("Donnée supprimée", HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<String> deleteAllMagasin() {
        magasinService.deleteAll();
        return new ResponseEntity<>("Données supprimées", HttpStatus.OK);
    }
}
