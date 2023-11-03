package com.example.blackcoffer_demo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerProfileAdapter extends RecyclerView.Adapter<RecyclerProfileAdapter.ViewHolder> {
    Context context;
    ArrayList<ProfileModel> arrProfile;
    RecyclerProfileAdapter(Context context, ArrayList<ProfileModel> arrProfile){
        this.arrProfile = arrProfile;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.people_card,parent,false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.profile.setImageResource(arrProfile.get(position).img);
        holder.name.setText(arrProfile.get(position).name);
        holder.city.setText(arrProfile.get(position).city);
        holder.occupation.setText(arrProfile.get(position).occupation);
        holder.attr1.setText(arrProfile.get(position).attr1);
        holder.attr2.setText(arrProfile.get(position).attr2);
        holder.attr3.setText(arrProfile.get(position).attr3);
        holder.range.setText(arrProfile.get(position).range);
        holder.status.setText(arrProfile.get(position).status);

    }

    @Override
    public int getItemCount() {

        return arrProfile.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView profile;
        TextView  name,city,occupation,range,attr1,attr2,attr3,status;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            profile = itemView.findViewById(R.id.profilephoto);
            name = itemView.findViewById(R.id.name);
            city = itemView.findViewById(R.id.city);
            occupation = itemView.findViewById(R.id.occupation);
            range = itemView.findViewById(R.id.range);
            attr1 = itemView.findViewById(R.id.attr1);
            attr2 = itemView.findViewById(R.id.attr2);
            attr3 = itemView.findViewById(R.id.attr3);
            status = itemView.findViewById(R.id.status);
        }
    }
}
