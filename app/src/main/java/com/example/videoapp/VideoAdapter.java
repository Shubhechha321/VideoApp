package com.example.videoapp;

import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class VideoAdapter extends RecyclerView.Adapter<VideoAdapter.viewHolder>{
    ArrayList<VideoModel> videos;

    public VideoAdapter(ArrayList<VideoModel> videos){
        this.videos = videos;
    }
    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_video_layout, parent, false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        holder.setData(videos.get(position));
    }

    @Override
    public int getItemCount() {
        return videos.size();
    }

    class viewHolder extends RecyclerView.ViewHolder{
        VideoView videoView;
        TextView title, channel;
        ProgressBar progressBar;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            videoView = itemView.findViewById(R.id.videoView);
            title = itemView.findViewById(R.id.videoTitle);
            progressBar = itemView.findViewById(R.id.progressBar);
        }
        void setData(VideoModel obj){
            videoView.setVideoPath(obj.getUrl());
            title.setText(obj.getTitle());

            videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    progressBar.setVisibility(View.INVISIBLE);
                    mp.start();
                }
            });
            videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    mp.start();
                }
            });
        }
    }
}
