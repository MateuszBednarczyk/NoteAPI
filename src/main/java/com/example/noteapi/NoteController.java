package com.example.noteapi;

import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class NoteController {

    private NoteService noteService;

    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    @GetMapping("/all")
    public Iterable <Note> getNotes(){

        return noteService.findAllNotes();

    }

    @GetMapping("/byid/{id}")
    public Optional<Note> getNoteById(@PathVariable Long id){

        return noteService.findById(id);

    }

    @PostMapping("/add")
    public void addNote(@RequestBody Note note){

        noteService.addNote(note);

    }

    @PutMapping("/update/{id}")
    public Iterable <Note> updatedNoteList(@PathVariable Long id, @RequestBody Note note){

        return noteService.updateNote(id, note);

    }

    @DeleteMapping("/del/{id}")
    public void deleteNote(@PathVariable Long id){

        noteService.deleteById(id);

    }

}
