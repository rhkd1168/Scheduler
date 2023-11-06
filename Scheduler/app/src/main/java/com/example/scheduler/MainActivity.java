package com.example.scheduler;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.CalendarView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CalendarView calendarView = findViewById(R.id.calendarView);

        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {
                // 선택된 날짜를 Intent로 전달하여 새로운 Activity로 이동
                Intent intent = new Intent(MainActivity.this, ToDoList_list.class);
                intent.putExtra("selectedYear", year);
                intent.putExtra("selectedMonth", month);
                intent.putExtra("selectedDay", dayOfMonth);
                startActivity(intent);
            }
        });
    }
}
