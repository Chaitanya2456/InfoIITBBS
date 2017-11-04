package com.example.infoiitbbs;

import android.app.Activity;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void bus(View v) {
        Intent goToSchedule = new Intent();
        goToSchedule.setClass(this, scheduleActivity.class);
        startActivity(goToSchedule);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }
    public void timeTable(View v) {
        Intent time = new Intent();
        time.setClass(this, TimeTableActivity.class);
        startActivity(time);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
    public void calendar(View v) {
        Intent cal = new Intent();
        cal.setClass(this, CalendarActivity.class);
        startActivity(cal);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

    public void subj(View v){
        Intent cur = new Intent();
        cur.setClass(this, curriculaActivity.class);
        startActivity(cur);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }
    public void holiday(View v){
         Intent hol = new Intent();
         hol.setClass(this, holActivity.class);
         startActivity(hol);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
    public void erp(View v){
        Intent er = new Intent();
        er.setClass(this, erpActivity.class);
        startActivity(er);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }




}
