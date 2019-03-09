package com.lou.alain.HackLassondeBackend;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import model.Item;

public interface ItemRepository extends MongoRepository <Item, String>{
	public List<Item> findAll();
}
