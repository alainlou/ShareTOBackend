package com.lou.alain.HackLassondeBackend.model;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class Item {
	@Id
	@Getter
	@Setter
	private String id;
	
	@Getter
	@Setter
	private String title;

	
	@Getter
	@Setter
	private String content;
	
	@Getter
	@Setter
	private String contact;
	
	@Getter
	@Setter
	private String address;
	
	@Getter
	@Setter
	private String lat;
	
	@Getter
	@Setter
	private String lng;
}
