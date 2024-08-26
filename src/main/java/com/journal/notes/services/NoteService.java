package com.journal.notes.services;

import java.util.List;
import java.util.Optional;

import com.journal.notes.domain.Note;

public interface NoteService {
    public Note create(Note note);
    public Note edit(Note note);
    public void delete(Note note);
    public List<Note> getAll();
    public Optional<Note> getById(int id);
}
