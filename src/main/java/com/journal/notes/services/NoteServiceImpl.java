package com.journal.notes.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.journal.notes.domain.Note;
import com.journal.notes.repositories.NotesRepository;


@Service
public class NoteServiceImpl implements NoteService {

    private NotesRepository notesRepository;

    public Note create(Note note) {
        return notesRepository.save(note);
    }

    public Note edit(Note note) {
        return notesRepository.save(note);
    }

    public void delete(Note note) {
        notesRepository.delete(note);
    }

    public List<Note> getAll() {
        return notesRepository.findAll();
    }

    public Optional<Note> getById(int id) {
        return Optional.of(notesRepository.findById(id).get());
    }
}
