package com.example.scheduler;

import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;

public class ToDoAdapter extends RecyclerView.Adapter<ToDoAdapter.ToDoViewHolder> {

    private List<String> toDoItems; // To-Do 항목 데이터 리스트

    // 생성자에서 데이터를 받아올 수 있도록 추가

    @Override
    public ToDoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.todo_item, parent, false);
        return new ToDoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ToDoViewHolder holder, int position) {
        String toDoItem = toDoItems.get(position);
        holder.bind(toDoItem);
    }

    @Override
    public int getItemCount() {
        return toDoItems.size();
    }

    class ToDoViewHolder extends RecyclerView.ViewHolder {
        private TextView toDoTextView;

        ToDoViewHolder(View itemView) {
            super(itemView);
            toDoTextView = itemView.findViewById(R.id.toDoTextView);
        }

        void bind(String toDoItem) {
            toDoTextView.setText(toDoItem);
        }
    }
}

