package com.example.recycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>{
    List<President> presidentList;
    Context context;

    public RecyclerViewAdapter(List<President> presidentList,Context context) {
        this.presidentList = presidentList;
        this.context = context;
    }



    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.one_line_president,parent,false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tvPreName.setText(presidentList.get(position).getName());
        holder.tvDate.setText(String.valueOf(presidentList.get(position).getdateofElection()));
        Glide.with(context).load(presidentList.get(position).getImageUrl()).into(holder.ivPresident);


    }

    @Override
    public int getItemCount() {
        return presidentList.size();
    }

    public  class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView ivPresident;
        TextView tvPreName;
        TextView tvDate;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            ivPresident = itemView.findViewById(R.id.ivPresident);
            tvPreName = itemView.findViewById(R.id.tvPreName);
            tvDate = itemView.findViewById(R.id.tvDate);
        }
    }
}
