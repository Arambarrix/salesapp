package com.server.backendsalesapp.controllers;

import com.server.backendsalesapp.dto.CategorieDTO;
import com.server.backendsalesapp.mappers.CategorieMapper;
import com.server.backendsalesapp.services.CategorieService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@AllArgsConstructor
@RequestMapping("/categories")
public class CategorieController {
    private final CategorieService categorieService;

    @PostMapping
    public ResponseEntity<CategorieDTO> saveCategorie(@RequestBody CategorieDTO categorieDTO) {
        return new ResponseEntity<>(CategorieMapper.INSTANCE.toDTO(categorieService.save(CategorieMapper.INSTANCE.toEntity(categorieDTO))), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CategorieDTO> fetchCategorie(@PathVariable("id") Integer id) {
        return new ResponseEntity<>(CategorieMapper.INSTANCE.toDTO(categorieService.findById(id)), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<CategorieDTO>> fetchListCategorie(@RequestParam(value = "limit", required = false) Integer limit, @RequestParam(value = "page", required = false) Integer page) {
        return new ResponseEntity<>(CategorieMapper.INSTANCE.toListDTO(categorieService.findAll(limit, page)), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CategorieDTO> updateCategorie(@PathVariable("id") Integer id, @RequestBody CategorieDTO categorieDTO) {
        return new ResponseEntity<>(CategorieMapper.INSTANCE.toDTO(categorieService.update(id, CategorieMapper.INSTANCE.toEntity(categorieDTO))), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCategorie(@PathVariable("id") Integer id) {
        categorieService.deleteById(id);
        return new ResponseEntity<>("Donnée supprimée", HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<String> deleteAllCategorie() {
        categorieService.deleteAll();
        return new ResponseEntity<>("Données supprimées", HttpStatus.OK);
    }
}
