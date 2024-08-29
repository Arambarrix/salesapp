package com.server.backendsalesapp.controllers;

import com.server.backendsalesapp.dto.EmployeDTO;
import com.server.backendsalesapp.mappers.EmployeMapper;
import com.server.backendsalesapp.services.EmployeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@AllArgsConstructor
@RequestMapping("/employes")
public class EmployeController {
    private final EmployeService employeService;

    @PostMapping
    public ResponseEntity<EmployeDTO> saveEmploye(@RequestBody EmployeDTO employeDTO) {
        return new ResponseEntity<>(EmployeMapper.INSTANCE.toDTO(employeService.save(EmployeMapper.INSTANCE.toEntity(employeDTO))), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmployeDTO> fetchEmploye(@PathVariable("id") Integer id) {
        return new ResponseEntity<>(EmployeMapper.INSTANCE.toDTO(employeService.findById(id)), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<EmployeDTO>> fetchListEmploye(@RequestParam(value = "limit", required = false) Integer limit, @RequestParam(value = "page", required = false) Integer page) {
        return new ResponseEntity<>(EmployeMapper.INSTANCE.toListDTO(employeService.findAll(limit, page)), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<EmployeDTO> updateEmploye(@PathVariable("id") Integer id, @RequestBody EmployeDTO employeDTO) {
        return new ResponseEntity<>(EmployeMapper.INSTANCE.toDTO(employeService.update(id, EmployeMapper.INSTANCE.toEntity(employeDTO))), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEmploye(@PathVariable("id") Integer id) {
        employeService.deleteById(id);
        return new ResponseEntity<>("Donnée supprimée", HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<String> deleteAllEmploye() {
        employeService.deleteAll();
        return new ResponseEntity<>("Données supprimées", HttpStatus.OK);
    }
}
