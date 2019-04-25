package com.lou.alain.HackLassondeBackend;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.lou.alain.HackLassondeBackend.model.Item;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class ItemDAO {
	private ItemRepository itemRepo;
	
	public List<Item> findAll() {
		return itemRepo.findAll();
	}
	
	public void save(Item item) {
		itemRepo.save(item);
	}

	public List<Item> findByTitle(String str) {
		str = str.toLowerCase();
		
		List<Item> items = itemRepo.findAll();
		List<Item> toReturn = new ArrayList<Item>();
		
		for(Item i : items) {
			if(i.getTitle().toLowerCase().contains(str)) {
				toReturn.add(i);
			}
		}
		
		return toReturn;
	}

}
