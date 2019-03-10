package com.lou.alain.HackLassondeBackend.model;

import java.io.IOException;

import org.springframework.stereotype.Service;

import com.google.maps.errors.ApiException;
import com.google.maps.model.LatLng;
import com.lou.alain.HackLassondeBackend.geocode.GeoCodingClient;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ItemTransformer {
	private GeoCodingClient geoCodingClient;
	
	public Item transform(BasicItem basicItem) throws ApiException, InterruptedException, IOException {
		Item item = new Item();
		item.setAvailable(basicItem.isAvailable());
		item.setContact(basicItem.getContact());
		item.setContent(basicItem.getContent());
		item.setId(basicItem.getId());
		item.setImg(basicItem.getImg());
		item.setLocation(basicItem.getLocation());
		item.setTitle(basicItem.getTitle());
		item.setType(basicItem.getType());
		
		// location from google geolocation api
		LatLng latLng = geoCodingClient.getLatLng(basicItem.getLocation());
		
		// set lat and long
		item.setLat(String.valueOf(latLng.lat));
		item.setLng(String.valueOf(latLng.lng));
		
		return item;
	}
}
