package com.server.backendsalesapp.controllers;

import com.server.backendsalesapp.dto.ClientDTO;
import com.server.backendsalesapp.mappers.ClientMapper;
import com.server.backendsalesapp.services.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@AllArgsConstructor
@RequestMapping("/clients")
public class ClientController {
    private final ClientService clientService;

    @PostMapping
    public ResponseEntity<ClientDTO> saveClient(@RequestBody ClientDTO clientDTO) {
        return new ResponseEntity<>(ClientMapper.INSTANCE.toDTO(clientService.save(ClientMapper.INSTANCE.toEntity(clientDTO))), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClientDTO> fetchClient(@PathVariable("id") Integer id) {
        return new ResponseEntity<>(ClientMapper.INSTANCE.toDTO(clientService.findById(id)), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<ClientDTO>> fetchListClient(@RequestParam(value = "limit", required = false) Integer limit, @RequestParam(value = "page", required = false) Integer page) {
        return new ResponseEntity<>(ClientMapper.INSTANCE.toListDTO(clientService.findAll(limit, page)), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ClientDTO> updateClient(@PathVariable("id") Integer id, @RequestBody ClientDTO clientDTO) {
        return new ResponseEntity<>(ClientMapper.INSTANCE.toDTO(clientService.update(id, ClientMapper.INSTANCE.toEntity(clientDTO))), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteClient(@PathVariable("id") Integer id) {
        clientService.deleteById(id);
        return new ResponseEntity<>("Donnée supprimée", HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<String> deleteAllClient() {
        clientService.deleteAll();
        return new ResponseEntity<>("Données supprimées", HttpStatus.OK);
    }
}
