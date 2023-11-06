package com.example.scheduler;


import androidx.appcompat.app.AppCompatActivity;
        import android.os.Bundle;
        import androidx.recyclerview.widget.LinearLayoutManager;
        import androidx.recyclerview.widget.RecyclerView;

public class ToDoList_list extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ToDoAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_do_list);

        recyclerView = findViewById(R.id.recyclerView);
        adapter = new ToDoAdapter(); // ToDo 항목을 표시할 어댑터 생성
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

        // 여기에서 ToDo 항목을 어댑터에 추가하거나 데이터를 불러오는 로직을 작성
        // 예를 들어, 데이터베이스에서 To-Do 항목을 불러와서 어댑터에 추가
    }
}
