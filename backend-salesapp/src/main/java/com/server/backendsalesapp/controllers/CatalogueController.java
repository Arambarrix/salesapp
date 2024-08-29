package com.server.backendsalesapp.controllers;

import com.server.backendsalesapp.dto.CatalogueDTO;
import com.server.backendsalesapp.mappers.CatalogueMapper;
import com.server.backendsalesapp.services.CatalogueService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@AllArgsConstructor
@RequestMapping("/catalogues")
public class CatalogueController {
    private final CatalogueService catalogueService;

    @PostMapping
    public ResponseEntity<CatalogueDTO> saveCatalogue(@RequestBody CatalogueDTO catalogueDTO) {
        return new ResponseEntity<>(CatalogueMapper.INSTANCE.toDTO(catalogueService.save(CatalogueMapper.INSTANCE.toEntity(catalogueDTO))), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CatalogueDTO> fetchCatalogue(@PathVariable("id") Integer id) {
        return new ResponseEntity<>(CatalogueMapper.INSTANCE.toDTO(catalogueService.findById(id)), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<CatalogueDTO>> fetchListCatalogue(@RequestParam(value = "limit", required = false) Integer limit, @RequestParam(value = "page", required = false) Integer page) {
        return new ResponseEntity<>(CatalogueMapper.INSTANCE.toListDTO(catalogueService.findAll(limit, page)), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CatalogueDTO> updateCatalogue(@PathVariable("id") Integer id, @RequestBody CatalogueDTO catalogueDTO) {
        return new ResponseEntity<>(CatalogueMapper.INSTANCE.toDTO(catalogueService.update(id, CatalogueMapper.INSTANCE.toEntity(catalogueDTO))), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCatalogue(@PathVariable("id") Integer id) {
        catalogueService.deleteById(id);
        return new ResponseEntity<>("Donnée supprimée", HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<String> deleteAllCatalogue() {
        catalogueService.deleteAll();
        return new ResponseEntity<>("Données supprimées", HttpStatus.OK);
    }
}
