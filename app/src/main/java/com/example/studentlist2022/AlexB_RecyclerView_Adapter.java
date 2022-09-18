package com.example.studentlist2022;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AlexB_RecyclerView_Adapter extends RecyclerView.Adapter<AlexB_RecyclerView_Adapter.AlexB_ViewHolder> {

    //Retrieves the recyclerView Interface
    private final AlexB_RecyclerView_Interface alexB_recyclerView_interface;
    Context context;

    //Holds the app suggestions string from parent AlexB_Activity.
    String[] appSuggestions;

    //Constructor
    public AlexB_RecyclerView_Adapter(Context context, String[] appSuggestions, AlexB_RecyclerView_Interface alexB_recyclerView_interface){
        this.context = context;
        this.appSuggestions = appSuggestions;
        this.alexB_recyclerView_interface = alexB_recyclerView_interface;
    }

    @NonNull
    @Override
    public AlexB_RecyclerView_Adapter.AlexB_ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.alexb_recyclerview_row, parent, false);
        return new AlexB_RecyclerView_Adapter.AlexB_ViewHolder(view, alexB_recyclerView_interface);
    }

    @Override
    public void onBindViewHolder(@NonNull AlexB_ViewHolder holder, int position){
        holder.recyclerRowText.setText(appSuggestions[position]);
    }

    @Override
    public int getItemCount(){
        //Sets the number of items in the recyclerView
        return appSuggestions.length;
    }

    public static class AlexB_ViewHolder extends RecyclerView.ViewHolder{

        TextView recyclerRowText;

        public AlexB_ViewHolder(@NonNull View itemView, AlexB_RecyclerView_Interface alexB_recyclerView_interface){
            super(itemView);

            recyclerRowText = itemView.findViewById(R.id.recyclerRowText);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (alexB_recyclerView_interface != null){
                        int adapterPosition = getAdapterPosition();

                        if (adapterPosition != RecyclerView.NO_POSITION){
                            alexB_recyclerView_interface.onItemClick(adapterPosition);
                        }
                    }
                }
            });
        }
    }
}
