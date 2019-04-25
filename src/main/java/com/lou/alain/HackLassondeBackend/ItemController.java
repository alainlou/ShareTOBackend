package com.lou.alain.HackLassondeBackend;

import java.io.IOException;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.maps.errors.ApiException;
import com.lou.alain.HackLassondeBackend.model.BasicItem;
import com.lou.alain.HackLassondeBackend.model.Item;
import com.lou.alain.HackLassondeBackend.model.ItemTransformer;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/api")
public class ItemController {
	
	private ItemDAO itemAccessor;
	private ItemTransformer itemTransformer;
	
	@GetMapping("/items/{title}")
	public List<Item> getItemByTitle(@PathVariable(value="title") String str){
		return itemAccessor.findByTitle(str);
	}
	
	@GetMapping("/items")
	public List<Item> getAllItems(){
		return itemAccessor.findAll();
	}
	
	@PostMapping("/items")
	public void pushItem(@RequestBody BasicItem basicItem) throws ApiException, InterruptedException, IOException {
		itemAccessor.save(itemTransformer.transform(basicItem));
	}
}
