package com.fikri.tamii.home;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.fikri.tamii.R;
import com.fikri.tamii.haji.ManasikHaji;
import com.fikri.tamii.haji.MandiBesar;
import com.fikri.tamii.haji.MaqamIbrahim;
import com.fikri.tamii.haji.Mekkah;
import com.fikri.tamii.haji.Miqab;
import com.fikri.tamii.haji.SunnahDenganIhram;
import com.fikri.tamii.haji.Thawaf;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Haji extends AppCompatActivity {

    @BindView(R.id.back)
    ImageView back;
    @BindView(R.id.linearManasikHaji)
    LinearLayout linearManasikHaji;
    @BindView(R.id.linearMandiBesar)
    LinearLayout linearMandiBesar;
    @BindView(R.id.linearMiqab)
    LinearLayout linearMiqab;
    @BindView(R.id.linearSholatSunnahDanLaranganIhram)
    LinearLayout linearSholatSunnahDanLaranganIhram;
    @BindView(R.id.linearMekkah)
    LinearLayout linearMekkah;
    @BindView(R.id.linearThawaf)
    LinearLayout linearThawaf;
    @BindView(R.id.linearMaqamIbrahim)
    LinearLayout linearMaqamIbrahim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_haji);
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

    @OnClick({R.id.back, R.id.linearManasikHaji, R.id.linearMandiBesar, R.id.linearMiqab, R.id.linearSholatSunnahDanLaranganIhram, R.id.linearMekkah, R.id.linearThawaf, R.id.linearMaqamIbrahim})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.back:
                onBackPressed();
                break;
            case R.id.linearManasikHaji:
                startActivity(new Intent(getApplicationContext(), ManasikHaji.class));
                break;
            case R.id.linearMandiBesar:
                startActivity(new Intent(getApplicationContext(), MandiBesar.class));
                break;
            case R.id.linearMiqab:
                startActivity(new Intent(getApplicationContext(), Miqab.class));
                break;
            case R.id.linearSholatSunnahDanLaranganIhram:
                startActivity(new Intent(getApplicationContext(), SunnahDenganIhram.class));
                break;
            case R.id.linearMekkah:
                startActivity(new Intent(getApplicationContext(), Mekkah.class));
                break;
            case R.id.linearThawaf:
                startActivity(new Intent(getApplicationContext(), Thawaf.class));
                break;
            case R.id.linearMaqamIbrahim:
                startActivity(new Intent(getApplicationContext(), MaqamIbrahim.class));
                break;
        }
    }
}
