package com.example.fhnib.fhnibcieot.CustomView;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fhnib.fhnibcieot.R;

import java.util.List;

public class MeojAdapter extends RecyclerView.Adapter<MeojAdapter.MeojViewHolder>{

    private Context context;
    private List<Meoj> meojList;

    public MeojAdapter(Context context, List<Meoj> meojList) {
        this.context = context;
        this.meojList = meojList;
    }

    @NonNull
    @Override
    public MeojViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.meoj,null);
        return new MeojViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MeojViewHolder meojViewHolder, int i) {
        Meoj meoj = meojList.get(i);
        meojViewHolder.textView.setText(meoj.getMeoj());
        meojViewHolder.imageView.setImageDrawable(context.getResources().getDrawable(meoj.getImage(),null));
    }

    @Override
    public int getItemCount() {
        return meojList.size();
    }

    class MeojViewHolder extends RecyclerView.ViewHolder{
        TextView textView;
        ImageView imageView;
        public MeojViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textviewMeoj);
            imageView = itemView.findViewById(R.id.imageviewMeoj);
        }
    }
}