package com.example.infoiitbbs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class erpActivity extends AppCompatActivity {
    private WebView w;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_erp);
        w = (WebView) findViewById(R.id.web);
        w.getSettings().setJavaScriptEnabled(true);
        w.loadUrl("http://www.iitbbs.ac.in/");

    }
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransitionExit();
    }

    private void overridePendingTransitionExit() {
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }



}
