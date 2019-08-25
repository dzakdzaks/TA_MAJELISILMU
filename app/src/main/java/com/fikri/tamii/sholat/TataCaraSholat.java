package com.fikri.tamii.sholat;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

import com.fikri.tamii.R;
import com.fikri.tamii.home.MainActivity;

import ru.dimorinny.showcasecard.ShowCaseView;
import ru.dimorinny.showcasecard.position.ViewPosition;
import ru.dimorinny.showcasecard.radius.Radius;

public class TataCaraSholat extends AppCompatActivity {

    MediaController media_Controller;
    DisplayMetrics dm;

    VideoView videoViewSaya;
    ImageView imagePlay, imageBack;

    SharedPreferences preferences;
    boolean firststart;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tata_cara_sholat);
        setView();
    }

    private void setView() {
        videoViewSaya = findViewById(R.id.videoView);
        imagePlay = findViewById(R.id.imgPlay);
        imageBack = findViewById(R.id.back);

        imageBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        media_Controller = new MediaController(this);
        dm = new DisplayMetrics();
        this.getWindowManager().getDefaultDisplay().getMetrics(dm);
        int height = dm.heightPixels;
        int width = dm.widthPixels;
        videoViewSaya.setMinimumWidth(width);
        videoViewSaya.setMinimumHeight(height);
        videoViewSaya.setMediaController(media_Controller);
        imagePlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                muatVideo("aws");
                videoViewSaya.start();
                imagePlay.setVisibility(View.GONE);
            }
        });

        imageBack.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(i);
                return false;
            }
        });

        preferences = getSharedPreferences("prefs", MODE_PRIVATE);
        firststart = preferences.getBoolean("firststart", true);

        if (firststart) {
            spotlight();
        }


    }

    private void spotlight() {
        new ShowCaseView.Builder(getApplicationContext())
                .withTypedPosition(new ViewPosition(imageBack))
                .withTypedRadius(new Radius(186F))
                .withContent("Tap disini untuk kembali, \n" +
                        "Tap dan Tahan untuk kembali ke menu utama.")
                .build()
                .show(this);

        SharedPreferences.Editor editor = preferences.edit();
        editor.putBoolean("firststart", false);
        editor.apply();

    }

    private void muatVideo(String nama_file) {
        videoViewSaya.setVideoPath("android.resource://" + getPackageName() + "/raw/" + nama_file);
    }

}
