package com.optiim.recorder.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document(collection="User")
public class User {
	
	@Id
	public String userId;
	
	@Getter @Setter
	private String name;
	
	@Getter @Setter
	private List<Note> notes;

}
