package com.example.studentlist2022;

import android.content.Context;
import android.telecom.Call;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private final RecyclerViewInterface recyclerViewInterface;
    Context context;
    ArrayList<String> arrayList;

    public RecyclerViewAdapter(Context context, ArrayList<String> arrayList, RecyclerViewInterface recyclerViewInterface)
    {
        this.context = context;
        this.arrayList = arrayList;
        this.recyclerViewInterface = recyclerViewInterface;
    }
    @NonNull
    @Override
    public RecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recycler_view_row, parent, false);
        return new RecyclerViewAdapter.MyViewHolder(view, recyclerViewInterface);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.MyViewHolder holder, int position) {
        //Assigns values to the views
        holder.textViewTest.setText(arrayList.get(position));
    }

    @Override
    public int getItemCount() {
        //Passes to recycler view how many items in the list
        return arrayList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder
    {
        TextView textViewTest;
        public MyViewHolder(@NonNull View itemView, RecyclerViewInterface recyclerViewInterface) {
            super(itemView);

            textViewTest = itemView.findViewById(R.id.textViewRecyclerView);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(recyclerViewInterface != null)
                    {
                        int pos = getAdapterPosition();

                        if(pos != RecyclerView.NO_POSITION)
                        {
                            recyclerViewInterface.onItemClick(pos);
                        }
                    }
                }
            });
        }

    }
}
