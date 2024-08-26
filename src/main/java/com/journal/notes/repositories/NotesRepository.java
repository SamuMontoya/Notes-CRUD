package com.journal.notes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.journal.notes.domain.Note;

@Repository
public interface NotesRepository extends JpaRepository<Note, Integer> {}
