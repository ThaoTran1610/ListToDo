package com.example.androidtodolist;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

public class AddTodoActivity extends AppCompatActivity {
    AppDatabase db;
    Button buttonAdd;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "database-name").build();


        buttonAdd = findViewById(R.id.add);
        text = findViewById(R.id.text_input);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String textinput = text.getText().toString();
            }
        });

    }

    void insertIntoDatabase(String inputData){
        Todo todo = new Todo();

    }
}
