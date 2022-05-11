package com.example.dreamplace.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.dreamplace.R;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Handler handle = new Handler();
        handle.postDelayed(new Runnable() {
            @Override public void run() {
                mostrarPaginaInicial();
            }
        }, 2000);
    }

    private void mostrarPaginaInicial() {
        Intent intent = new Intent(SplashScreenActivity.this, ListaPacotesActivity.class);
        startActivity(intent);
        finish();
    }
}