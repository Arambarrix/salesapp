package com.server.backendsalesapp.controllers;

import com.server.backendsalesapp.dto.AdresseDTO;
import com.server.backendsalesapp.mappers.AdresseMapper;
import com.server.backendsalesapp.services.AdresseService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@AllArgsConstructor
@RequestMapping("/adresses")
public class AdresseController {
    private final AdresseService adresseService;

    @PostMapping
    public ResponseEntity<AdresseDTO> saveAdresse(@RequestBody AdresseDTO adresseDTO) {
        return new ResponseEntity<>(AdresseMapper.INSTANCE.toDTO(adresseService.save(AdresseMapper.INSTANCE.toEntity(adresseDTO))), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AdresseDTO> fetchAdresse(@PathVariable("id") Integer id) {
        return new ResponseEntity<>(AdresseMapper.INSTANCE.toDTO(adresseService.findById(id)), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<AdresseDTO>> fetchListAdresse(@RequestParam(value = "limit", required = false) Integer limit, @RequestParam(value = "page", required = false) Integer page) {
        return new ResponseEntity<>(AdresseMapper.INSTANCE.toListDTO(adresseService.findAll(limit, page)), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AdresseDTO> updateAdresse(@PathVariable("id") Integer id, @RequestBody AdresseDTO adresseDTO) {
        return new ResponseEntity<>(AdresseMapper.INSTANCE.toDTO(adresseService.update(id, AdresseMapper.INSTANCE.toEntity(adresseDTO))), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteAdresse(@PathVariable("id") Integer id) {
        adresseService.deleteById(id);
        return new ResponseEntity<>("Donnée supprimée", HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<String> deleteAllAdresse() {
        adresseService.deleteAll();
        return new ResponseEntity<>("Données supprimées", HttpStatus.OK);
    }
}
