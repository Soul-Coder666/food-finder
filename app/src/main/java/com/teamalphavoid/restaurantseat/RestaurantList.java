package com.teamalphavoid.restaurantseat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;

import com.teamalphavoid.restaurantseat.Adapters.MainAdapter;
import com.teamalphavoid.restaurantseat.Models.MainModel;
import com.teamalphavoid.restaurantseat.databinding.ActivityRestaurantListBinding;
import com.teamalphavoid.restaurantseat.databinding.ActivityRestaurantListBinding;

import java.util.ArrayList;
import java.util.Objects;

public class RestaurantList extends AppCompatActivity {

     ActivityRestaurantListBinding binding;
     ArrayList<MainModel> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getSupportActionBar()).hide();
        binding = ActivityRestaurantListBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        list.add(new MainModel(R.drawable.image_1, "Arsalan Restaurant", "15", "Biryani, Mughlai, Bengali, Indian, Kebab, Rolls, North Indian"));

        list.add(new MainModel(R.drawable.image_2, "Mocambo", "20", "Chinese, Continental, Pan Asian, North Indian, Indian, Tandoori"));

        list.add(new MainModel(R.drawable.image_3, "Kolkata Rajbari", "19", "Bengali"));

        list.add(new MainModel(R.drawable.image_4, "Mainland China Restaurant", "35", "Chinese, Thai, Japanese, Pan Asian, Sushi"));

        list.add(new MainModel(R.drawable.image_5, "Tibetan Delight", "20", "Pan Asian, Chinese, Tibetan"));

        list.add(new MainModel(R.drawable.image_6, "Absolute Barbecue", "30", "Buffet"));

        list.add(new MainModel(R.drawable.image_7, "Trincas", "25", "Chinese, Mughlai, North Indian, Continental, Fast Food, Multicuisine, Indian"));

        list.add(new MainModel(R.drawable.image_8, "Aminia", "40", "Chinese, Indian, Pan Asian, Kebab, Rolls, Biryani, Mughlai, North Indian"));

        list.add(new MainModel(R.drawable.image_9, "Oudh", "33", "North Indian, Indian, Continental, Pan Asian, Tandoori"));

        list.add(new MainModel(R.drawable.image_10, "Rendezvous", "28", "South Indian, Italian, Bengali, Indian, Breakfast, Kebab, Chinese, Continental, North Indian"));

        list.add(new MainModel(R.drawable.image_11, "The Awadh Restaurant", "20", "Chinese, Biryani, North Indian, Indian, Arabic, Pan Asian, Afghani, Awadhi, Bangladeshi, Kebab, Middle Eastern, Multicuisine, Mughlai, Tandoori."));

        list.add(new MainModel(R.drawable.image_12, "Alfresco", "15", "Chinese, South Indian, North Indian, Indian"));

        list.add(new MainModel(R.drawable.image_13, "J W kitchen", "45", "Indian, Pan Asian, Thai, European, Breakfast, North Indian, Mediterranean, Multicuisine"));

        list.add(new MainModel(R.drawable.image_14, "Peter Cat", "30", "North Indian, Indian, Continental, Pan Asian, Tandoori"));

        list.add(new MainModel(R.drawable.image_15, "6 Ballygunge Place", "26", "Sea Food, Indian, Pan Asian, Bangladeshi, Bengali"));

        MainAdapter adapter = new MainAdapter(list, this);
        binding.recyclerView.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recyclerView.setLayoutManager(layoutManager);
    }
}