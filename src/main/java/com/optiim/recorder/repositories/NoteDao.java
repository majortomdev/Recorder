package com.optiim.recorder.repositories;

import java.util.Collection;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.optiim.recorder.models.Note;

@Repository
public interface NoteDao extends MongoRepository<Note, Integer> {
	Collection<Note> findAllUsersNotes(String user);
}
