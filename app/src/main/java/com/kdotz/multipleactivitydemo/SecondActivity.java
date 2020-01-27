package com.kdotz.multipleactivitydemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    public void goToPrevious(View view){
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String friend = intent.getStringExtra("Friend");
        Toast.makeText(this, "Friend: " +friend, Toast.LENGTH_SHORT).show();
    }
}
