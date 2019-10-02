package com.optiim.recorder.repositories;

import java.util.Collection;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.optiim.recorder.models.Note;

public interface NoteDao extends MongoRepository<Note, Integer> {
	Collection<Note> findAllUsersNotes(String user);
}
