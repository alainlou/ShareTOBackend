package com.lou.alain.HackLassondeBackend;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import model.Item;

@AllArgsConstructor
@Service
public class ItemAccessor {
	private ItemRepository itemRepo;
	
	public List<Item> findAll() {
		return itemRepo.findAll();
	}
	
	public void save(Item item) {
		itemRepo.save(item);
	}

}
