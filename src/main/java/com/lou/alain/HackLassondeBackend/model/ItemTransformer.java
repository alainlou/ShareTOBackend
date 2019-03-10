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
		item.setContact(basicItem.getContact());
		item.setContent(basicItem.getContent());
		item.setId(basicItem.getId());
		item.setTitle(basicItem.getTitle());
		
		// location from google geolocation api
		LatLng latLng = geoCodingClient.getLatLng(basicItem.getAddress());
		
		// set lat and long
		item.setLat(String.valueOf(latLng.lat));
		item.setLng(String.valueOf(latLng.lng));
		
		return item;
	}
}
