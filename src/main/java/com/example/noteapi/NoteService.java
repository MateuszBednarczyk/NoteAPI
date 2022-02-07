package com.example.noteapi;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Service
public class NoteService {

    private NoteRepository noteRepository;

    public NoteService(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    public @ResponseBody Iterable<Note> findAllNotes(){

        return noteRepository.findAll();

    }

    public @ResponseBody Optional<Note> findById(Long noteId){

        return noteRepository.findById(noteId);

    }

    public Note addNote(Note note){

        return noteRepository.save(note);

    }

    public @ResponseBody Iterable<Note> updateNote(Long noteId, Note note){

        noteRepository.deleteById(noteId);
        note.setNoteId(noteId);
        noteRepository.save(note);
        return noteRepository.findAll();

    }

    public void deleteById(Long noteId){
        noteRepository.deleteById(noteId);
    }

}
