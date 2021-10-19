package com.warrior.warriors.web.controller;
import com.warrior.warriors.dao.CharacterDao;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.warrior.warriors.model.Character;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;


@RestController
public class WarriorsController {

    @Autowired
    private CharacterDao CharacterDao;

    //Récupère la liste des personnages
    @Operation(summary = "Liste de tous les personnages")
    @RequestMapping(value = "/Character", method = RequestMethod.GET)
    public List<Character>characterList(){
        return CharacterDao.findAll();
    }

    // Récupère un personnage avec son Id
    @Operation(summary = "Récupère un personnage avec son Id")
    @GetMapping(value = "/Character/{id}")
    public Character displayCharacter(@PathVariable int id){
        return CharacterDao.findById(id);
    }

    //ajouter un personnage
    @Operation(summary = "Ajouter un personnage à la liste")
    @PostMapping(value = "/Character")
    public void addCharacter(@RequestBody Character character) {
        CharacterDao.save(character);
    }

    // Supprimer un personnage
    @Operation(summary = "Supprime un personnage")
    @DeleteMapping(value = "/Character/{id}")
    public void deleteById(@PathVariable int id){
        CharacterDao.deleteById(id);
    }

    @Operation(summary = "Met à jour un personnage avec son Id")
    @PutMapping(value = "/Character/{id}")
    public void updateById(@RequestBody Character character, @PathVariable int id){
        CharacterDao.updateById(character ,id);
    }

}