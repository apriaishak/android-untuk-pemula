package com.apriaishak.myrecyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListHeroAdapter extends RecyclerView.Adapter<ListHeroAdapter.ListViewHolder> {
    private ArrayList<Hero> listHero;
    public ListHeroAdapter(ArrayList<Hero> list)
    {
        this.listHero = list;
    }

    private OnItemClickCallback onItemClickCallback;
    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }



    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_hero, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Hero hero = listHero.get(position);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listHero.get(holder.getAdapterPosition()));
            }
        });

        Glide.with(holder.itemView.getContext())
                .load(hero.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);

        holder.tvName.setText(hero.getName());
        holder.tvFrom.setText(hero.getFrom());
    }

    public interface OnItemClickCallback {
        void onItemClicked(Hero data);
    }

    @Override
    public int getItemCount() {
        return listHero.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvFrom;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvFrom = itemView.findViewById(R.id.tv_item_from);




        }
    }
}
