package com.example.hp.helloworld;

import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override


            public void onClick(View v) {
                Log.d("ActivityState", "onClick Called");
                Toast.makeText(getApplicationContext(), "Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        Log.d("ActivityState", "onCreate");
    }



    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ActivityState", "onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ActivityState", "onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ActivityState", "onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("ActivityState", "onRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ActivityState", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ActivityState", "onDestroy");
    }
}
