package com.example.wpn50.pennstateartscrawl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //set the primary screen for the app
        setContentView(R.layout.activity_main);

        //set the view to get the About option
        FrameLayout abt = (FrameLayout) findViewById(R.id.about_page);

        //put a click listener on to go to the About activity
        abt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent aboutIntent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(aboutIntent);
            }
        });

        //set the view to get the Map option
        FrameLayout map = (FrameLayout) findViewById(R.id.map_page);

        //put a click listener on to go to the Map activity
        map.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent aboutIntent = new Intent(MainActivity.this, MapsActivity.class);
                startActivity(aboutIntent);
            }
        });

        //set the view to get the Lineup option
        FrameLayout lin = (FrameLayout) findViewById(R.id.lineup_page);

        //put a click listener on to go to the Lineup activity
        lin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent aboutIntent = new Intent(MainActivity.this, LineupActivity.class);
                startActivity(aboutIntent);
            }
        });

        //set the view to get the Schedule option
        FrameLayout sched = (FrameLayout) findViewById(R.id.schedule_page);

        //put a click listener on to go to the Schedule activity
        sched.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent aboutIntent = new Intent(MainActivity.this, ScheduleActivity.class);
                startActivity(aboutIntent);
            }
        });
    }
}
