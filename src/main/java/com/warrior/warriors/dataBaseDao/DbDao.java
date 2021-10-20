package com.warrior.warriors.dataBaseDao;

import com.warrior.warriors.model.Character;
import org.springframework.data.repository.CrudRepository;

public interface DbDao extends CrudRepository<Character, Integer> {
}
