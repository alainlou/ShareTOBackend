package com.lou.alain.HackLassondeBackend.model;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.Setter;

public class BasicItem {
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
}
