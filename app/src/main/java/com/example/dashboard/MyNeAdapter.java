package com.example.dashboard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyNeAdapter extends RecyclerView.Adapter<MyNeAdapter.MyViewHolder> {
    String data1[];
    int images[];
    Context context;


    public MyNeAdapter(Context ct, String s1[], int img[]) {
        context = ct;
        data1 = s1;
        images = img;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.categories_card_design, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.products_txt.setText(data1[position]);
        holder.myImage.setImageResource(images[position]);


    }

    @Override
    public int getItemCount() {
        return images.length;
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView products_txt;
        ImageView myImage;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            products_txt = itemView.findViewById(R.id.cattxt);
            myImage = itemView.findViewById(R.id.catimg);

        }
    }
}
