package com.lou.alain.HackLassondeBackend;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lou.alain.HackLassondeBackend.model.Item;

import lombok.AllArgsConstructor;

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
