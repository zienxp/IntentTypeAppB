package com.example.intenttypeappb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendEmail(View view) {
        Intent intent = new Intent();
        intent.setAction(intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra("message","this is a sample message");
        startActivity(intent);
        // will ask to open the send activity in IntentTypeAppA
    }
}
