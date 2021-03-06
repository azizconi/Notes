package com.example.notes;

import com.example.notes.DataBase.App;
import com.example.notes.DataBase.DataBase;
import com.example.notes.DataBase.Note;
import com.example.notes.DataBase.NoteDao;

import java.util.List;

public class Repository {
    private DataBase dataBase;
    private NoteDao noteDao;

    public Repository() {
        this.dataBase = App.getApplication().getDataBase();
        noteDao = dataBase.noteDao();
    }

    public List<Note> getListNotes() {
        List<Note> list = noteDao.getAllNotes();
        return list;
    }

    public void insertNewNote(Note note) {
        noteDao.insertNewNote(note);
    }

    public void updateNote(String title, String text, int id){
        noteDao.update(title, text, id);
    }

    public void deleteNote(Note note) {
        noteDao.delete(note);
    }

    public void deleteAll() {
        noteDao.deleteAllNotes();
    }
}
