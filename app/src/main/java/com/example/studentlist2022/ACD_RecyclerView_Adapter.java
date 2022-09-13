package com.example.studentlist2022;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ACD_RecyclerView_Adapter extends RecyclerView.Adapter<ACD_RecyclerView_Adapter.ACD_MyViewHolder> {

    private final ACD_RecyclerViewInterface acd_recyclerViewInterface;

    Context acd_context;
    ArrayList<ACD_AppSuggestionsModel> acd_appSuggestionsModels;

    public ACD_RecyclerView_Adapter(Context acd_context, ArrayList<ACD_AppSuggestionsModel> acd_appSuggestionsModels,
                                    ACD_RecyclerViewInterface acd_recyclerViewInterface){
       this.acd_context = acd_context;
       this.acd_appSuggestionsModels = acd_appSuggestionsModels;
       this.acd_recyclerViewInterface = acd_recyclerViewInterface;
    }
    @NonNull
    @Override
    public ACD_RecyclerView_Adapter.ACD_MyViewHolder onCreateViewHolder(@NonNull ViewGroup acd_parent, int viewType) {
        //This is where I use the layout - Basically give our rows their looks
        LayoutInflater acd_inflater = LayoutInflater.from(acd_context);
        View acd_view = acd_inflater.inflate(R.layout.activity_adavis_recyclerview_rows, acd_parent, false);
        return new ACD_RecyclerView_Adapter.ACD_MyViewHolder(acd_view, acd_recyclerViewInterface);
    }

    @Override
    public void onBindViewHolder(@NonNull ACD_RecyclerView_Adapter.ACD_MyViewHolder holder, int position) {
        //This is where I assign values to the different views created in adavis_recyclerview_rows
        //based on the position of the recycler view

        holder.acd_textView1.setText(acd_appSuggestionsModels.get(position).getAD_appSuggestionName());
        holder.acd_textView2.setText(acd_appSuggestionsModels.get(position).getAD_appSuggestionDetails());
        holder.acd_imageView.setImageResource(acd_appSuggestionsModels.get(position).getAD_infoImage());
    }

    @Override
    public int getItemCount() {
        //This is where I detail the number of items I want displayed
        return acd_appSuggestionsModels.size();
    }

    public static class ACD_MyViewHolder extends RecyclerView.ViewHolder{
        //This is where it grabs the views from adavis_recyclerview_rows layout file
        //Apparently similar to the onCreate method

        ImageView acd_imageView;
        TextView acd_textView1,acd_textView2;

        public ACD_MyViewHolder(@NonNull View itemView, ACD_RecyclerViewInterface acd_recyclerViewInterface) {
            super(itemView);

            acd_imageView = itemView.findViewById(R.id.acd_infoImageView);
            acd_textView1 = itemView.findViewById(R.id.acd_textView3);
            acd_textView2 = itemView.findViewById(R.id.acd_textView4);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(acd_recyclerViewInterface != null){
                        int pos = getAdapterPosition();

                        if(pos != RecyclerView.NO_POSITION){
                            acd_recyclerViewInterface.onItemClick(pos);
                        }
                    }
                }
            });
        }
    }

}
