package model;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
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
	private String type;
	
	@Getter
	@Setter
	private String description;
	
	@Getter
	@Setter
	private String img;
	
	@Getter
	@Setter
	private String location;
	
	@Getter
	@Setter
	private boolean available;
}
