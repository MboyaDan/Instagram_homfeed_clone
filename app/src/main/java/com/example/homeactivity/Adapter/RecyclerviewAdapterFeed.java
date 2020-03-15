package com.example.homeactivity.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.example.homeactivity.Models.HomeModel;
import com.example.homeactivity.R;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerviewAdapterFeed extends RecyclerView.Adapter<RecyclerviewAdapterFeed.MyViewHolder> {
private Context context;
private List<HomeModel> mData;
RequestManager glide;

    public RecyclerviewAdapterFeed(Context context, List<HomeModel> mData) {
        this.context = context;
        this.mData = mData;
        this.glide = Glide.with(context);
    }

    @NonNull
    @Override
    public RecyclerviewAdapterFeed.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;
        LayoutInflater inflater=LayoutInflater.from(context);
        view=inflater.inflate(R.layout.homefeeds,parent,false);
        return new RecyclerviewAdapterFeed.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerviewAdapterFeed.MyViewHolder holder, final int position) {
        holder.uploadername.setText(mData.get(position).getName());
        holder.likername.setText(mData.get(position).getLikeBy());
        holder.posttime.setText(mData.get(position).getTime());
        holder.likes.setText(mData.get(position).getLikes()+"others");
        holder.captionnames.setText(mData.get(position).getName());
        holder.tags.setText(mData.get(position).getTags());
glide.load(mData.get(position).getUploderPic()).into(holder.uploader);
glide.load(mData.get(position).getProPic()).into(holder.liker);
glide.load(mData.get(position).getLikerPic()).into(holder.post);
glide.load(mData.get(position).getPostpic()).into(holder.post);



    }

    @Override
    public int getItemCount() {
        return mData.size();
    }
    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView uploadername,likername,posttime,likes,captionnames,tags;
        CircleImageView uploader,userpic,liker;
        ImageView post;

        public MyViewHolder(@NonNull View mView) {
            super(mView);
            uploadername= mView.findViewById(R.id.tv_uploader_name);
            likername= mView.findViewById(R.id.liker_name);
            posttime= mView.findViewById(R.id.tv_time);
            likes= mView.findViewById(R.id.tv_likes);
            captionnames= mView.findViewById(R.id.tv_uploader_name_caption);
            tags= mView.findViewById(R.id.tv_tag);

          uploader= mView.findViewById(R.id.uploader_pro_pic);
          userpic= mView.findViewById(R.id.user_pro_pic);
          liker= mView.findViewById(R.id.like_pro_pic);
          post= mView.findViewById(R.id.post_pic);
        }
    }
}
