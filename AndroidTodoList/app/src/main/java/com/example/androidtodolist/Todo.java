package com.example.androidtodolist;

import androidx.room.PrimaryKey;

public class Todo {

    @PrimaryKey
    public int id;

    public String tasks;
}
