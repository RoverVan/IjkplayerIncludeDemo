package com.rovervan.ijkplayerincludedemo;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import tv.danmaku.ijk.media.player.IjkMediaPlayer;
import tv.danmaku.ijk.media.player.widget.IjkVideoView;


public class MainActivity extends AppCompatActivity {

    IjkVideoView mVideoView;
    private Uri mVideoUri;
    private String VideoPath = "http://www.modrails.com/videos/passenger_nginx.mov" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IjkMediaPlayer.loadLibrariesOnce(null);
        IjkMediaPlayer.native_profileBegin("libijkplayer.so");

        mVideoView = (IjkVideoView) findViewById(R.id.video_view);
        mVideoUri = Uri.parse(VideoPath);
        mVideoView.setVideoURI(mVideoUri);
        mVideoView.start();
    }
}
