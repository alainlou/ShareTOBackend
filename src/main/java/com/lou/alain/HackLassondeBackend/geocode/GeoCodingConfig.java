package com.lou.alain.HackLassondeBackend.geocode;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@ConfigurationProperties(prefix = "geocoding")
public class GeoCodingConfig {
	private String apiKey;
}
