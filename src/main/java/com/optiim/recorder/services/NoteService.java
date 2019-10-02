package com.optiim.recorder.services;

import java.util.Collection;
import java.util.Optional;

import com.optiim.recorder.models.Note;




public interface NoteService {
	public Note createNote(String id, String name, String content);
	public Optional<Note> getNoteById(String id);
	public Collection<Note> findAllUserNotesByUserId(String user);
}
