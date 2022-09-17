package com.example.studentlist2022;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AB_Adapter extends RecyclerView.Adapter<AB_Adapter.AB_ViewHolder> {

    private final AB_RecyclerView_Interface ab_rvInterface;

    Context ab_context;
    ArrayList<AB_AppSuggestions> ab_appSuggestions;

    public AB_Adapter(Context ab_context, ArrayList<AB_AppSuggestions> ab_appSuggestions, AB_RecyclerView_Interface ab_rvInterface){
        this.ab_context = ab_context;
        this.ab_appSuggestions = ab_appSuggestions;
        this.ab_rvInterface = ab_rvInterface;
    }

    @NonNull
    @Override
    public  AB_Adapter.AB_ViewHolder onCreateViewHolder(@NonNull ViewGroup ab_parent, int viewType){

    }

    public static class AB_ViewHolder(@NonNull View itemView, AB_RecyclerView_Interface ab_recyclerView_interface){
        super(itemView);

        ab_imageView = itemView.findViewById(R.id.ab_infoImageView);
        ab_
    }
}
