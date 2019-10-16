package com.example.androidtodolist;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TodoAdapter {


    class TodoViewHolder extends RecyclerView.ViewHolder{
        TextView tvTodo;

        public TodoViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTodo = itemView.findViewById(R.id.text_input);
        }
    }
}
