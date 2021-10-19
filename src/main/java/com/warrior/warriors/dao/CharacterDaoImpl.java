package com.warrior.warriors.dao;

import com.warrior.warriors.model.Character;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CharacterDaoImpl implements CharacterDao{
    public static List<Character>characters=new ArrayList<>();
    static {
        characters.add(new Character(1, "Mage", "Magicien"));
        characters.add(new Character(2, "Guerrier", "Guerrier"));
        characters.add(new Character(3, "Guerrier Magicien", "Guerrier"));
    }
    @Override
    public List<Character> findAll() {
        return characters;
    }

    @Override
    public Character findById(int id) {
        for (Character character : characters){
            if(character.getId() == id){
                return character;
            }
        }
        return null;
    }

    @Override
    public Character save(Character character) {
        Character copy = new Character(
                character.getId(),
                character.getName(),
                character.getType()
        );
        characters.add(copy);
        return character;
    }

    @Override
    public void deleteById(int id){
        characters.removeIf(character -> character.getId() == id);
    }

    @Override
    public void updateById(Character updateCharacter, int id) {
        for (Character character : characters){
            if (character.getId() == id){
                character.setName(updateCharacter.getName());
                character.setType(updateCharacter.getType());
            }
        }
    }
}