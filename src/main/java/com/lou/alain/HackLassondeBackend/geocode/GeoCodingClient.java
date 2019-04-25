package com.lou.alain.HackLassondeBackend.geocode;

import java.io.IOException;

import org.springframework.stereotype.Service;

import com.google.maps.GeoApiContext;
import com.google.maps.GeocodingApi;
import com.google.maps.errors.ApiException;
import com.google.maps.model.GeocodingResult;
import com.google.maps.model.LatLng;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class GeoCodingClient {
	private GeoCodingConfig geoCodingConfig;
			
	public LatLng getLatLng(String address) throws ApiException, InterruptedException, IOException {
		GeoApiContext context = new GeoApiContext.Builder().apiKey(geoCodingConfig.getApiKey()).build();
		GeocodingResult [] results = GeocodingApi.geocode(context, address).await();
		return results[0].geometry.location;
	}
}
