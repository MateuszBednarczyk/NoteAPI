package com.example.noteapi;

import javax.persistence.*;

@Entity
@Table(name = "note")
public class Note {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long noteId;
  private String noteTitle;
  private String noteContent;

  public Note(String noteTitle, String noteContent) {
    this.noteTitle = noteTitle;
    this.noteContent = noteContent;
  }

  public Note() {
  }

  public long getNoteId() {
    return noteId;
  }

  public void setNoteId(long noteId) {
    this.noteId = noteId;
  }

  public String getNoteTitle() {
    return noteTitle;
  }

  public void setNoteTitle(String noteTitle) {
    this.noteTitle = noteTitle;
  }

  public String getNoteContent() {
    return noteContent;
  }

  public void setNoteContent(String noteContent) {
    this.noteContent = noteContent;
  }

}
