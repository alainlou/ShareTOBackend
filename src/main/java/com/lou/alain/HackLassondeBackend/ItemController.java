package com.lou.alain.HackLassondeBackend;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import model.Item;

@AllArgsConstructor
@RestController
@CrossOrigin(origins="*")
public class ItemController {
	
	private ItemAccessor itemAccessor;
	
	@GetMapping("/items")
	public List<Item> getAllItems(){
		return itemAccessor.findAll();
	}
}
