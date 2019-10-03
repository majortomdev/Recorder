//by JK 02/10/19
package com.optiim.recorder.controllers;
import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.optiim.recorder.models.Note;
import com.optiim.recorder.services.NoteService;

@RestController
@RequestMapping("/notes")
public class NoteController {
	
	@Autowired
	NoteService serv;
	
	@RequestMapping(method=RequestMethod.POST, value="/create")
	public String create(@RequestParam String id, @RequestParam String name, @RequestParam String content ) {
		Note note = serv.createNote(id, name, content);
		return note.toString();
	}
	
	@RequestMapping(method=RequestMethod.GET, value="getNote")
	public Optional<Note> getNoteById(@RequestParam String id) {
		return serv.getNoteById(id);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/getByUser")
	public Collection<Note> getNotesByUser (@RequestParam String user){
		return serv.findAllUserNotesByUserId(user);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/edit")
	public Note changeNote (@RequestParam String content, @RequestParam String id ) {
		Optional<Note> n = serv.getNoteById(id);
		
		if(n!=null) {
			
		}
	}

}
