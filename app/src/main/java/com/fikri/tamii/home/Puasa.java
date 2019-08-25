package com.fikri.tamii.home;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.fikri.tamii.R;
import com.fikri.tamii.puasa.AmalanDalamPuasa;
import com.fikri.tamii.puasa.KajianPuasa;
import com.fikri.tamii.puasa.PuasaHaram;
import com.fikri.tamii.puasa.PuasaMakhruh;
import com.fikri.tamii.puasa.PuasaSunnah;
import com.fikri.tamii.puasa.PuasaWjib;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Puasa extends AppCompatActivity {

    @BindView(R.id.back)
    ImageView back;
    @BindView(R.id.linearKajianPuasa)
    LinearLayout linearKajianPuasa;
    @BindView(R.id.linearAmalanDalamPuasa)
    LinearLayout linearAmalanDalamPuasa;
    @BindView(R.id.linearPuasaWajib)
    LinearLayout linearPuasaWajib;
    @BindView(R.id.linearPuasaSunnah)
    LinearLayout linearPuasaSunnah;
    @BindView(R.id.linearPuasaMakhruh)
    LinearLayout linearPuasaMakhruh;
    @BindView(R.id.linearPuasaHaram)
    LinearLayout linearPuasaHaram;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puasa);
        ButterKnife.bind(this);

        back.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(i);
                return false;
            }
        });
    }

    @OnClick({R.id.back, R.id.linearKajianPuasa, R.id.linearAmalanDalamPuasa, R.id.linearPuasaWajib, R.id.linearPuasaSunnah, R.id.linearPuasaMakhruh, R.id.linearPuasaHaram})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.back:
                onBackPressed();
                break;
            case R.id.linearKajianPuasa:
                startActivity(new Intent(getApplicationContext(), KajianPuasa.class));
                break;
            case R.id.linearAmalanDalamPuasa:
                startActivity(new Intent(getApplicationContext(), AmalanDalamPuasa.class));
                break;
            case R.id.linearPuasaWajib:
                startActivity(new Intent(getApplicationContext(), PuasaWjib.class));
                break;
            case R.id.linearPuasaSunnah:
                startActivity(new Intent(getApplicationContext(), PuasaSunnah.class));
                break;
            case R.id.linearPuasaMakhruh:
                startActivity(new Intent(getApplicationContext(), PuasaMakhruh.class));
                break;
            case R.id.linearPuasaHaram:
                startActivity(new Intent(getApplicationContext(), PuasaHaram.class));
                break;
        }
    }
}
