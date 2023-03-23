package com.example.fragmentlifecyclejava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String COMMON_TAG = "CombinedLifeCycle";
    private static final String ACTIVITY_NAME = MainActivity.class.getSimpleName();
    private static final String TAG = COMMON_TAG;

    Button firstFragmentBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Fragment Lifecycle Java");
        Log.i(TAG, ACTIVITY_NAME + " onCreate");
        Toast.makeText(this, "I am on onCreate from MainActivity", Toast.LENGTH_SHORT).show();

        firstFragmentBtn = findViewById(R.id.fragment1btn);

        firstFragmentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.frameLayout, Fragment1.class, null)
                        .commit();


            }
        });
    }

    @Override
    protected void onStart() {
        Log.i(TAG, ACTIVITY_NAME + " onStart");
        Toast.makeText(this, "I am onStart from MainActivity", Toast.LENGTH_SHORT).show();
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.i(TAG, ACTIVITY_NAME + " onResume");
        Toast.makeText(this, "I am onResume from MainActivity", Toast.LENGTH_SHORT).show();
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.i(TAG, ACTIVITY_NAME + " onPause");
        Toast.makeText(this, "I am onPause from MainActivity", Toast.LENGTH_SHORT).show();
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.i(TAG, ACTIVITY_NAME + " onStop");
        Toast.makeText(this, "I am onStop from MainActivity", Toast.LENGTH_SHORT).show();
        super.onStop();
    }

    @Override
    protected void onRestart() {
        Log.i(TAG, ACTIVITY_NAME + " onRestart");
        Toast.makeText(this, "I am onRestart from MainActivity", Toast.LENGTH_SHORT).show();
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        Log.i(TAG, ACTIVITY_NAME + " onDestroy");
        Toast.makeText(this, "I am onDestroy from MainActivity", Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }

    @Override public void onBackPressed() {
        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.frameLayout);
        if (!(fragment instanceof IOnBackPressed) || !((IOnBackPressed) fragment).onBackPressed()) {
            super.onBackPressed();
        }
    }

}