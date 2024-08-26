package com.journal.notes.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.journal.notes.domain.Note;
import com.journal.notes.services.NoteServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/notes")
public class NoteController {
    private  NoteServiceImpl noteService;

    @PostMapping("/create")
    public Note create(@RequestBody Note note) {
        return noteService.create(note);
    }
    
    @GetMapping("/list")
    public ResponseEntity<List<Note>> getAll() {
        return ResponseEntity.ok(noteService.getAll());
    }

    @GetMapping("/detail({id}")
    public Optional<Note> getById(@PathVariable Integer id) {
        return noteService.getById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id) {
        noteService.delete(noteService.getById(id).get());
    }

    @PutMapping("/edit/{id}")
    public Note edit(@RequestBody Note note, @PathVariable Integer id) {
        note.setId(id);
        return noteService.edit(note);
    }
}
