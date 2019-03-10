package com.lou.alain.HackLassondeBackend;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lou.alain.HackLassondeBackend.model.Item;

public interface ItemRepository extends MongoRepository <Item, String>{
	public List<Item> findAll();
}
