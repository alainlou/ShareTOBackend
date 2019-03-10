package com.lou.alain.HackLassondeBackend;

import java.io.IOException;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.maps.errors.ApiException;
import com.lou.alain.HackLassondeBackend.model.BasicItem;
import com.lou.alain.HackLassondeBackend.model.Item;
import com.lou.alain.HackLassondeBackend.model.ItemTransformer;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@CrossOrigin(origins="*")
public class ItemController {
	
	private ItemAccessor itemAccessor;
	private ItemTransformer itemTransformer;
	
	@GetMapping("/items")
	public List<Item> getAllItems(){
		return itemAccessor.findAll();
	}
	
	@PostMapping("/post-item")
	public void pushItem(@RequestBody BasicItem basicItem) throws ApiException, InterruptedException, IOException {
		itemAccessor.save(itemTransformer.transform(basicItem));
	}
}
