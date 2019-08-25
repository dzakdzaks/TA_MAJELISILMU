package com.fikri.tamii.home;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

import com.fikri.tamii.R;
import com.fikri.tamii.about.About;
import com.fikri.tamii.profile.Profile;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.cardSholat)
    CardView cardSholat;
    @BindView(R.id.cardPuasa)
    CardView cardPuasa;
    @BindView(R.id.cardHaji)
    CardView cardHaji;
    @BindView(R.id.cardZakat)
    CardView cardZakat;
    @BindView(R.id.cardProfile)
    CardView cardProfile;
    @BindView(R.id.cardAbout)
    CardView cardAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.cardSholat, R.id.cardPuasa, R.id.cardHaji, R.id.cardZakat, R.id.cardProfile, R.id.cardAbout})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.cardSholat:
                startActivity(new Intent(getApplicationContext(), Sholat.class));
                break;
            case R.id.cardPuasa:
                startActivity(new Intent(getApplicationContext(), Puasa.class));
                break;
            case R.id.cardHaji:
                startActivity(new Intent(getApplicationContext(), Haji.class));
                break;
            case R.id.cardZakat:
                startActivity(new Intent(getApplicationContext(), Zakat.class));
                break;
            case R.id.cardProfile:
                startActivity(new Intent(getApplicationContext(), Profile.class));
                break;
            case R.id.cardAbout:
                startActivity(new Intent(getApplicationContext(), About.class));
                break;
        }
    }
}
