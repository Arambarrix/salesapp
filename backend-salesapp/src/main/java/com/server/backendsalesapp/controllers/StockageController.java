package com.server.backendsalesapp.controllers;

import com.server.backendsalesapp.dto.StockageDTO;
import com.server.backendsalesapp.mappers.StockageMapper;
import com.server.backendsalesapp.services.StockageService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@AllArgsConstructor
@RequestMapping("/stockages")
public class StockageController {
    private final StockageService stockageService;

    @PostMapping
    public ResponseEntity<StockageDTO> saveStockage(@RequestBody StockageDTO stockageDTO) {
        return new ResponseEntity<>(StockageMapper.INSTANCE.toDTO(stockageService.save(StockageMapper.INSTANCE.toEntity(stockageDTO))), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<StockageDTO> fetchStockage(@PathVariable("id") Integer id) {
        return new ResponseEntity<>(StockageMapper.INSTANCE.toDTO(stockageService.findById(id)), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<StockageDTO>> fetchListStockage(@RequestParam(value = "limit", required = false) Integer limit, @RequestParam(value = "page", required = false) Integer page) {
        return new ResponseEntity<>(StockageMapper.INSTANCE.toListDTO(stockageService.findAll(limit, page)), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<StockageDTO> updateStockage(@PathVariable("id") Integer id, @RequestBody StockageDTO stockageDTO) {
        return new ResponseEntity<>(StockageMapper.INSTANCE.toDTO(stockageService.update(id, StockageMapper.INSTANCE.toEntity(stockageDTO))), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteStockage(@PathVariable("id") Integer id) {
        stockageService.deleteById(id);
        return new ResponseEntity<>("Donnée supprimée", HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<String> deleteAllStockage() {
        stockageService.deleteAll();
        return new ResponseEntity<>("Données supprimées", HttpStatus.OK);
    }
}
