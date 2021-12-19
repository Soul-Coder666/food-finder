package com.teamalphavoid.restaurantseat.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.teamalphavoid.restaurantseat.Models.MainModel;
import com.teamalphavoid.restaurantseat.R;
import com.teamalphavoid.restaurantseat.ReserveActivity;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.viewholder>{

    ArrayList<MainModel> list;

    public MainAdapter(ArrayList<MainModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    Context context;

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.adapter_restaurantlist, parent, false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        final MainModel model = list.get(position);
        holder.restaurantImage.setImageResource(model.getImage());
        holder.restaurantName.setText(model.getName());
        holder.seat.setText(model.getSeat());
        holder.description.setText(model.getDescription());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Intent intent = new Intent(context, ReserveActivity.class);
                 intent.putExtra("image", model.getImage());
                 intent.putExtra("name", model.getName());
                 intent.putExtra("seat", model.getSeat());
                 intent.putExtra("description", model.getDescription());
                 context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewholder extends RecyclerView.ViewHolder{

        ImageView restaurantImage;
        TextView restaurantName, seat, description;
        public viewholder(@NonNull View itemView) {
            super(itemView);

            restaurantImage = itemView.findViewById(R.id.restaurant_image);
            restaurantName = itemView.findViewById(R.id.name);
            seat = itemView.findViewById(R.id.seat);
            description = itemView.findViewById(R.id.description);
        }
    }
}


