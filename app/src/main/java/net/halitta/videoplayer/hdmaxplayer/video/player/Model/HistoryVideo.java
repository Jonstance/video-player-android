package net.halitta.videoplayer.hdmaxplayer.video.player.Model;

import net.halitta.videoplayer.hdmaxplayer.video.player.Extra.MediaData;

import java.util.ArrayList;

public class HistoryVideo {
    ArrayList<MediaData> videoList;

    public HistoryVideo(ArrayList<MediaData> arrayList) {
        this.videoList = arrayList;
    }

    public ArrayList<MediaData> getVideoList() {
        return this.videoList;
    }

    public void setVideoList(ArrayList<MediaData> arrayList) {
        this.videoList = arrayList;
    }
}
