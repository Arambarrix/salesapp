package com.server.backendsalesapp.controllers;

import com.server.backendsalesapp.dto.VilleDTO;
import com.server.backendsalesapp.mappers.VilleMapper;
import com.server.backendsalesapp.services.VilleService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@AllArgsConstructor
@RequestMapping("/villes")
public class VilleController {
    private final VilleService villeService;

    @PostMapping
    public ResponseEntity<VilleDTO> saveVille(@RequestBody VilleDTO villeDTO) {
        return new ResponseEntity<>(VilleMapper.INSTANCE.toDTO(villeService.save(VilleMapper.INSTANCE.toEntity(villeDTO))), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<VilleDTO> fetchVille(@PathVariable("id") Integer id) {
        return new ResponseEntity<>(VilleMapper.INSTANCE.toDTO(villeService.findById(id)), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<VilleDTO>> fetchListVille(@RequestParam(value = "limit", required = false) Integer limit, @RequestParam(value = "page", required = false) Integer page) {
        return new ResponseEntity<>(VilleMapper.INSTANCE.toListDTO(villeService.findAll(limit, page)), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<VilleDTO> updateVille(@PathVariable("id") Integer id, @RequestBody VilleDTO villeDTO) {
        return new ResponseEntity<>(VilleMapper.INSTANCE.toDTO(villeService.update(id, VilleMapper.INSTANCE.toEntity(villeDTO))), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteVille(@PathVariable("id") Integer id) {
        villeService.deleteById(id);
        return new ResponseEntity<>("Donnée supprimée", HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<String> deleteAllVille() {
        villeService.deleteAll();
        return new ResponseEntity<>("Données supprimées", HttpStatus.OK);
    }
}
