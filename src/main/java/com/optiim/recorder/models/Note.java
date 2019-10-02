//by jk 02/10/19
package com.optiim.recorder.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document(collection = "Note")
public class Note {

	@Id
	public String id;
	@Getter @Setter
	public String user;
	@Getter @Setter
	private String content;
	
	public Note (String id, String name, String content) {
		this.id=id; 
		this.user=name;
		this.content=content;
	}
	@Override
	public String toString() {
		return "Note Id: "+id+", User: "+user+", Content: "+content;
	}
	
}
