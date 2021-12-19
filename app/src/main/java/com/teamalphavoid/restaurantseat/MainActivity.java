package com.teamalphavoid.restaurantseat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
protected Button register, login;
protected TextView skip;
Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Objects.requireNonNull(getSupportActionBar()).hide();
        register = findViewById(R.id.register);
        login = findViewById(R.id.login);
        skip = findViewById(R.id.skip);
        register.setOnClickListener(v -> {
            intent = new Intent(MainActivity.this, SignUpActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        });
        login.setOnClickListener(v -> {
            intent = new Intent(MainActivity.this, SignInActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        });
        skip.setOnClickListener(v -> {
            intent = new Intent(MainActivity.this, SearchActivity.class);
            startActivity(intent);
        });
    }
}