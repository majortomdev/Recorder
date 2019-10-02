//by JK 02/10/19
package com.optiim.recorder.services;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.optiim.recorder.models.Note;
import com.optiim.recorder.repositories.NoteDao;

public class NoteServiceImpl implements NoteService {

	@Autowired
	private NoteDao dao;
	
	@Override
	public Note createNote(String id, String user, String content ) {
		return dao.save(new Note(id,user,content));	
	}

	@Override
	public Optional<Note> getNoteById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Note> findAllUserNotesByUserId(String user) {
		
		
	}

}
