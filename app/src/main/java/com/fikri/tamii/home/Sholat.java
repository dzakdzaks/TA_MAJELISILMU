package com.fikri.tamii.home;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.fikri.tamii.R;
import com.fikri.tamii.sholat.DalilPerintahSholat;
import com.fikri.tamii.sholat.HukumSholatFardhu;
import com.fikri.tamii.sholat.RukunSholat;
import com.fikri.tamii.sholat.SyaratSahSholat;
import com.fikri.tamii.sholat.SyaratWajibSholat;
import com.fikri.tamii.sholat.TataCaraSholat;
import com.fikri.tamii.sholat.WaktuDilarangSholat;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Sholat extends AppCompatActivity {

    @BindView(R.id.back)
    ImageView back;
    @BindView(R.id.linearTataCaraSholat)
    LinearLayout linearTataCaraSholat;
    @BindView(R.id.linearDalilPerintahSholat)
    LinearLayout linearDalilPerintahSholat;
    @BindView(R.id.linearWaktuDilarangSholat)
    LinearLayout linearWaktuDilarangSholat;
    @BindView(R.id.linearHukumSholatFardu)
    LinearLayout linearHukumSholatFardu;
    @BindView(R.id.linearSyaratWajibSholat)
    LinearLayout linearSyaratWajibSholat;
    @BindView(R.id.linearSyaratSahSholat)
    LinearLayout linearSyaratSahSholat;
    @BindView(R.id.linearRukunSholat)
    LinearLayout linearRukunSholat;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sholat);
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

    @OnClick({R.id.back, R.id.linearTataCaraSholat, R.id.linearDalilPerintahSholat, R.id.linearWaktuDilarangSholat, R.id.linearHukumSholatFardu, R.id.linearSyaratWajibSholat, R.id.linearSyaratSahSholat, R.id.linearRukunSholat})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.back:
                onBackPressed();
                break;
            case R.id.linearTataCaraSholat:
                startActivity(new Intent(getApplicationContext(), TataCaraSholat.class));
                break;
            case R.id.linearDalilPerintahSholat:
                startActivity(new Intent(getApplicationContext(), DalilPerintahSholat.class));
                break;
            case R.id.linearWaktuDilarangSholat:
                startActivity(new Intent(getApplicationContext(), WaktuDilarangSholat.class));
                break;
            case R.id.linearHukumSholatFardu:
                startActivity(new Intent(getApplicationContext(), HukumSholatFardhu.class));
                break;
            case R.id.linearSyaratWajibSholat:
                startActivity(new Intent(getApplicationContext(), SyaratWajibSholat.class));
                break;
            case R.id.linearSyaratSahSholat:
                startActivity(new Intent(getApplicationContext(), SyaratSahSholat.class));
                break;
            case R.id.linearRukunSholat:
                startActivity(new Intent(getApplicationContext(), RukunSholat.class));
                break;
        }
    }


}
