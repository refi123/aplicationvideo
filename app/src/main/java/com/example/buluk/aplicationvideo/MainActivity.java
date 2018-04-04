package com.example.buluk.aplicationvideo;


import android.media.MediaPlayer;
import android.net.Uri;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import java.util.IllegalFormatCodePointException;

public class MainActivity extends AppCompatActivity implements MediaPlayer.OnCompletionListener {

    VideoView videoV;
    MediaController media;
    Button btn1 ;
    Button btn2 ;
    Button btn3 ;
    Button btn4 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        videoV = (VideoView) findViewById(R.id.viewvideo);
        btn1 = (Button) findViewById(R.id.batiktulis);
        btn2 = (Button) findViewById(R.id.batikcap1);
        btn3 = (Button) findViewById(R.id.batikcap2);
        btn4 = (Button) findViewById(R.id.batikcoletan);
        media = new MediaController(this);
    }
// Memulai mediacontoroler
        public void Batiktulis(View view) {
//vido lokasi file
            Uri lokasifile = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.batikvideo);
            videoV.setVideoURI(lokasifile);
            videoV.setMediaController(media);
            media.setAnchorView(videoV);
            videoV.start();
        }


    public void capBatikI(View view) {
//vido lokasi file
        Uri lokasifile = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.videodua);
        videoV.setVideoURI(lokasifile);
        videoV.setMediaController(media);
        media.setAnchorView(videoV);
        videoV.start();
    }

    public void capBatikII(View view) {
//vido lokasi file
        Uri lokasifile = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.videotiga);
        videoV.setVideoURI(lokasifile);
        videoV.setMediaController(media);
        media.setAnchorView(videoV);
        videoV.start();
    }
    public void Batikcoletan(View view) {
//vido lokasi file
        Uri lokasifile = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.videoempat);
        videoV.setVideoURI(lokasifile);
        videoV.setMediaController(media);
        media.setAnchorView(videoV);
        videoV.start();
    }


    @Override
    public void onCompletion(MediaPlayer mp) {
        finish();
    }
}
