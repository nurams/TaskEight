package com.example.user.tugasapiprojek.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.user.tugasapiprojek.R;
import com.example.user.tugasapiprojek.model.ResultsItem;
import com.squareup.picasso.Picasso;

import java.util.List;

import pl.droidsonroids.gif.GifImageView;

public class ArticleAdapter extends RecyclerView.Adapter<ArticleAdapter.Holder> {
    private List<ResultsItem> mediaItemList;
    private Context context;



    public ArticleAdapter(Context context, List<ResultsItem> mediaItemList) {
        this.context = context;
        this.mediaItemList = mediaItemList;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_artikel, parent, false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(ArticleAdapter.Holder holder, final int
            //holder:class, class holder ada di article adapter
            position) {
        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return mediaItemList.size();
    }

    class Holder extends RecyclerView.ViewHolder {
        private RelativeLayout openEdukasi;
        private GifImageView imgArtikel;
        private TextView tvJudul;

        public Holder(View itemView) {
            super(itemView);
            imgArtikel = itemView.findViewById(R.id.dancer);
            tvJudul = itemView.findViewById(R.id.tv_judul_artikel);
            openEdukasi = itemView.findViewById(R.id.openEdukasi);
        }

        public void bind(final int position) {

            //Picasso.get()
            //        .load(mediaItemList.get(position).getMedia().get(0).getTinygif().getUrl())
              //      .placeholder(R.mipmap.ic_launcher)
                //    .error(R.mipmap.ic_launcher)
                  //  .into(imgArtikel);
            Glide.with(itemView)
                    .load(mediaItemList.get(position).getMedia().get(0).getGif().getUrl())
                    .into(imgArtikel);
            tvJudul.setText(mediaItemList.get(position).getTitle());
            openEdukasi.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context, "clicked : " +
                                    tvJudul.getText().toString() + "\n Position : " + String.valueOf(position),
                            Toast.LENGTH_LONG).show();

                }
            });
        }
    }
}