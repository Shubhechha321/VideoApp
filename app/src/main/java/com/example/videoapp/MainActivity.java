package com.example.videoapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.WindowManager;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ArrayList<VideoModel> videos;
ViewPager2 viewPager2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        viewPager2 = findViewById(R.id.vertical_viewpager);
        videos = new ArrayList<>();

        VideoModel ob1 = new VideoModel("http://techslides.com/demos/sample-videos/small.mp4", "Title1", "Channel1");
        videos.add(ob1);
        VideoModel ob2 = new VideoModel("https://www.rmp-streaming.com/media/big-buck-bunny-360p.mp4", "Title2", "Channel2");
        videos.add(ob2);
        VideoModel ob3 = new VideoModel("http://techslides.com/demos/sample-videos/small.mp4", "Title3", "Channel3");
        videos.add(ob3);
        VideoModel ob4 = new VideoModel("https://www.rmp-streaming.com/media/big-buck-bunny-360p.mp4", "Title4", "Channel4");
        videos.add(ob4);
        VideoModel ob5 = new VideoModel("https://www.rmp-streaming.com/media/big-buck-bunny-360p.mp4", "Title5", "Channel5");
        videos.add(ob5);

        viewPager2.setAdapter(new VideoAdapter(videos));
    }
}