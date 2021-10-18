package com.warrior.warriors.web.controller;
import org.springframework.web.bind.annotation.*;

import com.warrior.warriors.model.Character;

import java.util.ArrayList;
import java.util.List;


@RestController
public class Warriors {
    @RequestMapping(value="/Character", method= RequestMethod.GET)
    public @ResponseBody
    // Création d'une liste de personnages
    List<Character> characterList() {
        Character character1 = new Character(1, "Thor", "Guerrier"); // Création d'un personnage
        Character character2 = new Character(2, "Ron Wesley", "Magicien"); // Création d'un personnage
        Character character3 = new Character(3, "Voldemort", "Magicien"); // Création d'un personnage
        List<Character> CharacterList = new ArrayList<>(); // Création de la liste
        CharacterList.add(character1); // Ajout de personnage dans la liste
        CharacterList.add(character2); // Ajout de personnage dans la liste
        CharacterList.add(character3); // Ajout de personnage dans la liste
        return CharacterList; // Retourne la liste des personnages
    }

    //Récupérer un personnage par son Id
    @GetMapping(value="/Character/{id}")
    public Character displayCharacter(@PathVariable int id) {
        Character character1 = new Character(1, "Thor", "Guerrier"); // Création d'un personnage
        Character character2 = new Character(2, "Ron Wesley", "Magicien"); // Création d'un personnage
        Character character3 = new Character(3, "Voldemort", "Magicien"); // Création d'un personnage
        List<Character> CharacterList = new ArrayList<>(); // Création de la liste
        CharacterList.add(character1); // Ajout de personnage dans la liste
        CharacterList.add(character2); // Ajout de personnage dans la liste
        CharacterList.add(character3); // Ajout de personnage dans la liste
        return CharacterList.get(id - 1); // Retourne le personnage avec son id
    }
}
