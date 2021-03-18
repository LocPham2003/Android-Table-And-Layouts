package com.example.sampleuiredo;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ListView matchScheduleView;

    String[] blueAlliance = {"1","1","1","1","1"};
    String[] redAlliance = {"2","2","2","2","2"};
    Integer[] match = {1,2,3,4,5};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MatchSchedule matchSchedule = new MatchSchedule(this, blueAlliance, redAlliance, match);
        matchScheduleView = findViewById(R.id.matchSchedule);
        matchScheduleView.setAdapter(matchSchedule);
    }
}
