package com.example.hellotoast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView mtextview;
int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mtextview = findViewById(R.id.text1);
        if(savedInstanceState!=null && savedInstanceState.containsKey("ap")){
            count = savedInstanceState.getInt("ap");
            mtextview.setText(String.valueOf(count));
        }

    }

    public void ShowTime(View view) {
        Toast.makeText(this,"count is "+ count, Toast.LENGTH_SHORT).show();
    }

    public void ShowCount(View view) {
        count++;
        mtextview.setText(String.valueOf(count));
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("ap",count);
    }
}
