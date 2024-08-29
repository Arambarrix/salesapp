package com.server.backendsalesapp.controllers;

import com.server.backendsalesapp.dto.PaysDTO;
import com.server.backendsalesapp.mappers.PaysMapper;
import com.server.backendsalesapp.services.PaysService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@AllArgsConstructor
@RequestMapping("/pays")
public class PaysController {
    private final PaysService paysService;

    @PostMapping
    public ResponseEntity<PaysDTO> savePays(@RequestBody PaysDTO paysDTO) {
        return new ResponseEntity<>(PaysMapper.INSTANCE.toDTO(paysService.save(PaysMapper.INSTANCE.toEntity(paysDTO))), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PaysDTO> fetchPays(@PathVariable("id") Integer id) {
        return new ResponseEntity<>(PaysMapper.INSTANCE.toDTO(paysService.findById(id)), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<PaysDTO>> fetchListPays(@RequestParam(value = "limit", required = false) Integer limit, @RequestParam(value = "page", required = false) Integer page) {
        return new ResponseEntity<>(PaysMapper.INSTANCE.toListDTO(paysService.findAll(limit, page)), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PaysDTO> updatePays(@PathVariable("id") Integer id, @RequestBody PaysDTO paysDTO) {
        return new ResponseEntity<>(PaysMapper.INSTANCE.toDTO(paysService.update(id, PaysMapper.INSTANCE.toEntity(paysDTO))), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePays(@PathVariable("id") Integer id) {
        paysService.deleteById(id);
        return new ResponseEntity<>("Donnée supprimée", HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<String> deleteAllPays() {
        paysService.deleteAll();
        return new ResponseEntity<>("Données supprimées", HttpStatus.OK);
    }
}
