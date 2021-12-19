package com.teamalphavoid.restaurantseat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class SignUpActivity extends AppCompatActivity {
TextView login_intent;
Button signUp;
Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        login_intent = findViewById(R.id.login_intent);
        signUp = findViewById(R.id.sign_up);
        getSupportActionBar().setTitle("Sign Up");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        signUp.setOnClickListener(v -> {
            intent = new Intent(SignUpActivity.this, SearchActivity.class);
            startActivity(intent);
        });

        login_intent.setOnClickListener(v -> {
            intent = new Intent(SignUpActivity.this, SignInActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            finish();
        });

    }
    @Override
    public boolean onSupportNavigateUp(){
        onBackPressed();
        return super.onSupportNavigateUp();
    }
}