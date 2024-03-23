package com.example.phgeemedapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    public MyAdapter(Context context, ArrayList<Users> list) {
        this.context = context;
        this.list = list;
    }

    Context context;
    ArrayList<Users> list;


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        return new MyViewHolder((v));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Users user = list.get(position);
        holder.fullName.setText(user.name);
        holder.email.setText((user.email));
        holder.phoneNumber.setText(user.phonenum);
        holder.sRole.setText(user.role);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView fullName, email, phoneNumber,sRole;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            fullName = itemView.findViewById(R.id.editTextListName);
            email = itemView.findViewById(R.id.editTextListEmail);
            phoneNumber = itemView.findViewById((R.id.editTextListPhone));
            sRole = itemView.findViewById(R.id.editTextListRole);
        }
    }
}
