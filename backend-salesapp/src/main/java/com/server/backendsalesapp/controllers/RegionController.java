package com.server.backendsalesapp.controllers;

import com.server.backendsalesapp.dto.RegionDTO;
import com.server.backendsalesapp.mappers.RegionMapper;
import com.server.backendsalesapp.services.RegionService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@AllArgsConstructor
@RequestMapping("/regions")
public class RegionController {
    private final RegionService regionService;

    @PostMapping
    public ResponseEntity<RegionDTO> saveRegion(@RequestBody RegionDTO regionDTO) {
        return new ResponseEntity<>(RegionMapper.INSTANCE.toDTO(regionService.save(RegionMapper.INSTANCE.toEntity(regionDTO))), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<RegionDTO> fetchRegion(@PathVariable("id") Integer id) {
        return new ResponseEntity<>(RegionMapper.INSTANCE.toDTO(regionService.findById(id)), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<RegionDTO>> fetchListRegion(@RequestParam(value = "limit", required = false) Integer limit, @RequestParam(value = "page", required = false) Integer page) {
        return new ResponseEntity<>(RegionMapper.INSTANCE.toListDTO(regionService.findAll(limit, page)), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<RegionDTO> updateRegion(@PathVariable("id") Integer id, @RequestBody RegionDTO regionDTO) {
        return new ResponseEntity<>(RegionMapper.INSTANCE.toDTO(regionService.update(id, RegionMapper.INSTANCE.toEntity(regionDTO))), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteRegion(@PathVariable("id") Integer id) {
        regionService.deleteById(id);
        return new ResponseEntity<>("Donnée supprimée", HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<String> deleteAllRegion() {
        regionService.deleteAll();
        return new ResponseEntity<>("Données supprimées", HttpStatus.OK);
    }
}
