package com.server.backendsalesapp.controllers;

import com.server.backendsalesapp.dto.CommandeDTO;
import com.server.backendsalesapp.mappers.CommandeMapper;
import com.server.backendsalesapp.services.CommandeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@AllArgsConstructor
@RequestMapping("/commandes")
public class CommandeController {
    private final CommandeService commandeService;

    @PostMapping
    public ResponseEntity<CommandeDTO> saveCommande(@RequestBody CommandeDTO commandeDTO) {
        return new ResponseEntity<>(CommandeMapper.INSTANCE.toDTO(commandeService.save(CommandeMapper.INSTANCE.toEntity(commandeDTO))), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CommandeDTO> fetchCommande(@PathVariable("id") Integer id) {
        return new ResponseEntity<>(CommandeMapper.INSTANCE.toDTO(commandeService.findById(id)), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<CommandeDTO>> fetchListCommande(@RequestParam(value = "limit", required = false) Integer limit, @RequestParam(value = "page", required = false) Integer page) {
        return new ResponseEntity<>(CommandeMapper.INSTANCE.toListDTO(commandeService.findAll(limit, page)), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CommandeDTO> updateCommande(@PathVariable("id") Integer id, @RequestBody CommandeDTO commandeDTO) {
        return new ResponseEntity<>(CommandeMapper.INSTANCE.toDTO(commandeService.update(id, CommandeMapper.INSTANCE.toEntity(commandeDTO))), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCommande(@PathVariable("id") Integer id) {
        commandeService.deleteById(id);
        return new ResponseEntity<>("Donnée supprimée", HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<String> deleteAllCommande() {
        commandeService.deleteAll();
        return new ResponseEntity<>("Données supprimées", HttpStatus.OK);
    }
}
