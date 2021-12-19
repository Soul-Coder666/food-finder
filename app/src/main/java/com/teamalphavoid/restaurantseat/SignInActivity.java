package com.teamalphavoid.restaurantseat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class SignInActivity extends AppCompatActivity {
TextView register_intent;
Button signIn;
Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        register_intent = findViewById(R.id.register_intent);
        signIn = findViewById(R.id.sign_in);
        getSupportActionBar().setTitle("Sign In");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        signIn.setOnClickListener(v -> {
            intent = new Intent(SignInActivity.this, SearchActivity.class);
            startActivity(intent);
        });

        register_intent.setOnClickListener(v -> {
            intent = new Intent(SignInActivity.this, SignUpActivity.class);
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