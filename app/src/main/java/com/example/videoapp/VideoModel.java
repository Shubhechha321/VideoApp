package com.example.videoapp;

public class VideoModel {
    String url, title, channel;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public VideoModel(String url, String title, String channel) {
        this.url = url;
        this.title = title;
        this.channel = channel;
    }


}
