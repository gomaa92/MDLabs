package com.example.mdlabs;


import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.bumptech.glide.Glide;

import java.util.ArrayList;


public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolderClass> {

    ArrayList<Countries> countries;

    Context context ;
    public static class ViewHolderClass extends RecyclerView.ViewHolder {

        private ImageView imageView;
        private TextView name;
        private TextView rank;
        private TextView population;
        private View currentView;

        public ViewHolderClass(View itemView) {
            super(itemView);
            this.currentView = itemView;
        }
        public ImageView getImageView() {
            if (imageView == null)
                imageView = currentView.findViewById(R.id.image);
            return imageView;
        }

        public TextView getName() {
            if (name == null)
                name = currentView.findViewById(R.id.nameID);
            return name;
        }

        public TextView getRank() {
            if (rank == null)
                rank = currentView.findViewById(R.id.rankID);
            return rank;
        }

        public TextView getPopulation() {
            if (population == null)
                population = currentView.findViewById(R.id.populationID);
            return population;
        }

    }

    public Adapter( Context context ,ArrayList<Countries> countries ) {
        this.countries=countries;
        this.context = context;
    }

    @Override
    public ViewHolderClass onCreateViewHolder(ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row, viewGroup, false);
        ViewHolderClass holderClass = new ViewHolderClass(view);
        return holderClass;
    }

    @Override
    public void onBindViewHolder(ViewHolderClass viewHolderClass, final int position) {

        viewHolderClass.getName().setText(countries.get(position).getCountry());
        viewHolderClass.getPopulation().setText(countries.get(position).getPopulation());
        viewHolderClass.getRank().setText(String.valueOf(countries.get(position).getRank()));

        Glide.with(context).load(countries.get(position).getFlag()).into(viewHolderClass.getImageView());


        viewHolderClass.currentView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context , ImageProtection.class);

                intent.putExtra("image" ,countries.get(position).getFlag());
                intent.putExtra("name" ,countries.get(position).getCountry());
                intent.putExtra("rank" ,countries.get(position).getRank());
                intent.putExtra("population" ,countries.get(position).getPopulation());

                context.startActivity(intent);



                //Toast.makeText(context, countries.get(position).getCountry(), Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    public int getItemCount() {
        return countries.size();
    }
}
