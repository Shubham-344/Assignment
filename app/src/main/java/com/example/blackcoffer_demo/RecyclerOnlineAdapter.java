package com.example.blackcoffer_demo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerOnlineAdapter extends RecyclerView.Adapter<RecyclerOnlineAdapter.ViewHolder> {
    Context context2;
    ArrayList<OnlineModel> arrOnline;
    RecyclerOnlineAdapter(Context context2, ArrayList<OnlineModel> arrOnline){
        this.context2 = context2;
        this.arrOnline = arrOnline;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context2).inflate(R.layout.online_card,parent,false);
        ViewHolder ViewHolder = new ViewHolder(view);
        return ViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    holder.img.setImageResource(arrOnline.get(position).img);
    }

    @Override
    public int getItemCount() {
        return arrOnline.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.profilephotoview);
        }
    }
}
