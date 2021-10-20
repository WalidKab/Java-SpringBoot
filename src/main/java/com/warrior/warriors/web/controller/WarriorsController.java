package com.warrior.warriors.web.controller;
import com.warrior.warriors.dao.CharacterDao;
import com.warrior.warriors.dataBaseDao.DbDao;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.warrior.warriors.model.Character;

import java.util.Optional;


@RestController
public class WarriorsController {

    @Autowired
    private DbDao characterDao;

    //Récupère la liste des personnages
    @Operation(summary = "Liste de tous les personnages")
    @RequestMapping(value = "/Character", method = RequestMethod.GET)
    public Iterable<Character>characterList(){
        return characterDao.findAll();
    }

    // Récupère un personnage avec son Id
    @Operation(summary = "Récupère un personnage avec son Id")
    @GetMapping(value = "/Character/{id}")
    public Optional<Character> displayCharacter(@PathVariable int id){
        return characterDao.findById(id);
    }

    //ajouter un personnage
    @Operation(summary = "Ajouter un personnage à la liste")
    @PostMapping(value = "/Character")
    public void addCharacter(@RequestBody Character character) {
        characterDao.save(character);
    }

    // Supprimer un personnage
    @Operation(summary = "Supprime un personnage")
    @DeleteMapping(value = "/Character/{id}")
    public void deleteById(@PathVariable int id){
        characterDao.deleteById(id);
    }

    @Operation(summary = "Met à jour un personnage avec son Id")
    @PutMapping(value = "/Character/{id}")
    public void updateById(@RequestBody Character character, @PathVariable int id){
        character.setId(id);
        characterDao.save(character);
    }

}