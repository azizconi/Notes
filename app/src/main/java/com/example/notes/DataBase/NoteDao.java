package com.example.notes.DataBase;


import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface NoteDao{


   //Новая запись
    @Insert
    public void insertNewNotes(Note note);

//    этот метод вытащит кокретную запись по id
    @Query("select * from `Note` where `id` = id")
    public List<Note> getNotes();


//    этот метод вытащит все записи из таблицы Note
    @Query("select * from `Note`")
    public List<Note> getAllNotes();


//  обновление записи
    @Update
    void update(Note note);



//  удаление записи
    @Delete
    void delete(Note note);

}