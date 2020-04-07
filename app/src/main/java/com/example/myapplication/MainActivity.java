package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickButton(View view){
        TextView textView = findViewById(R.id.textView);
        textView.setText("Hi SkillBox");
    }

    public void onClickButton2(View view){
        TextView textView = findViewById(R.id.textView2);
        textView.setText("Hi Android");
    }
}
