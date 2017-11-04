package com.example.infoiitbbs;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class curriculaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        try
        {
            this.getSupportActionBar().hide();
        }
        catch (NullPointerException e){}
        setContentView(R.layout.activity_curricula);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransitionExit();
    }

    private void overridePendingTransitionExit() {
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }


    public void ece(View v){
        Intent goToEce = new Intent();
        goToEce.setClass(this, eceActivity.class);
        startActivity(goToEce);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

    public void cse(View v){
        Intent goToCse = new Intent();
        goToCse.setClass(this, cseActivity.class);
        startActivity(goToCse);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    public void ee(View v){
        Intent goToEe = new Intent();
        goToEe.setClass(this, eeActivity.class);
        startActivity(goToEe);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

    public void ce(View v){
        Intent goToCe = new Intent();
        goToCe.setClass(this, ceActivity.class);
        startActivity(goToCe);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }
    public void me(View v){
        Intent goToMe = new Intent();
        goToMe.setClass(this, meActivity.class);
        startActivity(goToMe);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
    public void mm(View v){
        Intent goToMm = new Intent();
        goToMm.setClass(this, mmActivity.class);
        startActivity(goToMm);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }


}
