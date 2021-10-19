package com.warrior.warriors.dao;
import com.warrior.warriors.model.Character;

import java.util.List;

public interface CharacterDao {
    public List<Character>findAll();
    public Character findById(int id);
    public Character save(Character character);
    public void deleteById(int id);
    public void updateById(Character character, int id);
}
