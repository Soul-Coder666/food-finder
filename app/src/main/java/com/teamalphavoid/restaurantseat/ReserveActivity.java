package com.teamalphavoid.restaurantseat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ReserveActivity extends AppCompatActivity{

    ImageView restaurant_image, counter_inc, counter_dec;
    TextView restaurant_name, restaurant_description, restaurant_seat, counter;
    Button reserve;
    int counting;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reserve);

        restaurant_image = findViewById(R.id.rest_image);
        restaurant_name = findViewById(R.id.rest_name);
        restaurant_description = findViewById(R.id.rest_desc);
        counter_dec = findViewById(R.id.counter_dec);
        counter_inc = findViewById(R.id.counter_inc);
        counter = findViewById(R.id.counter);
        reserve = findViewById(R.id.reserve);
        restaurant_seat = findViewById(R.id.rest_seat);

        int image = getIntent().getIntExtra("image", 0);
        String name = getIntent().getStringExtra("name");
        String seat = getIntent().getStringExtra("seat");
        String description = getIntent().getStringExtra("description");
        restaurant_image.setImageResource(image);
        restaurant_name.setText(name);
        restaurant_description.setText(description);
        restaurant_seat.setText(seat);

        counter_dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counting = Integer.parseInt(counter.getText().toString());
                if(counting > 1){
                    counting = counting - 1;
                }
                counter.setText(String.valueOf(counting));
//                Toast.makeText(ReserveActivity.this, "Decrement", Toast.LENGTH_SHORT).show();
            }
        });
        counter_inc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counting = Integer.parseInt(counter.getText().toString());
                if(counting < 50){
                    counting = counting + 1;
                }
                counter.setText(String.valueOf(counting));
//                Toast.makeText(ReserveActivity.this, "Increment", Toast.LENGTH_SHORT).show();
            }
        });

        reserve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ReserveActivity.this, "Your Seat has been Reserved", Toast.LENGTH_SHORT).show();
            }
        });
    }
}