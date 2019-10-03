//by JK 02/10/19
package com.optiim.recorder.services;

import java.util.Collection;
import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.optiim.recorder.models.Note;
import com.optiim.recorder.repositories.NoteDao;

@Service
public abstract class NoteServiceImpl implements NoteService {

	@Autowired
	private NoteDao dao;
	
	@Override
	public Note createNote(String id, String user, String content ) {
		return dao.save(new Note(id,user,content));	
	}

	@Override
	public Optional<Note> getNoteById(String id) {
		return dao.findById(Integer.parseInt(id));
		//i realise the id string may have letters in it but im not sure how to iterate
		//through the mongodb collection to test for field equality......
	}

	@Override
	public Collection<Note> findAllUserNotesByUserId(String user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addDate(int id, int y, int m, int d ) {
		 Optional<Note> note = dao.findById(id);
		 @SuppressWarnings("deprecation")
		Date date = new Date(y,m,d);
		//
	}

	@Override
	public void addLocation(int id, String loc) {
		// TODO Auto-generated method stub
		
	}

//	@Override
//	public Collection<Note> findAllUserNotesByUserId(String user) {
//		dao.findAllUsersNotes(user.equalsIgnoreCase(Note.user));
//		return null;
//	}

//	@Override
//	public Collection<Note> findAllUserNotesByUserId(String user) {
//		List<Note> list = new ArrayList<>();
//		DBCollection col = MongoTemplate.
//		
//		return list;
//	}


}
