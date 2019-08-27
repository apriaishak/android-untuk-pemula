package apps.taufiq.batikindonesia;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class adapter extends RecyclerView.Adapter<adapter.myViewHolder> {


    private List<pojo> batikList;


    public adapter(List<pojo> batikList) {
        this.batikList = batikList;
    }

    @NonNull
    @Override
    public adapter.myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new myViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false)
        );
    }

    @Override
    public void onBindViewHolder(@NonNull adapter.myViewHolder holder, int position) {
        holder.binding(batikList.get(position));
    }

    @Override
    public int getItemCount() {
        return batikList.size();
    }

    public class myViewHolder extends RecyclerView.ViewHolder {

        ImageView poster;
        TextView nama;
        TextView asal;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            poster = itemView.findViewById(R.id.iv_batik);
            nama = itemView.findViewById(R.id.nama_batik);
            asal = itemView.findViewById(R.id.asal_batik);
        }

        public void binding(final pojo item) {
            poster.setImageResource(item.getBatikPoster());
            nama.setText(item.getNamaBatik());
            asal.setText(item.getAsalBatik());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(itemView.getContext(), BatikDetail.class);
                    intent.putExtra(BatikDetail.IMAGE, item.getImageUrl());
                    intent.putExtra(BatikDetail.DESCRIPTIONS, item.getDeskripsi());
                    intent.putExtra(BatikDetail.NAMA_BATIK, item.getNamaBatik());
                    intent.putExtra(BatikDetail.ASAL_BATIK, item.getAsalBatik());
                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }
}
