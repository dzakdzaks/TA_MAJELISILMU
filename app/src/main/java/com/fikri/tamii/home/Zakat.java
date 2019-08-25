package com.fikri.tamii.home;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.fikri.tamii.R;
import com.fikri.tamii.zakat.ZakatFitrah;
import com.fikri.tamii.zakat.ZakatMall;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Zakat extends AppCompatActivity {

    ImageView imageBack;
    @BindView(R.id.back)
    ImageView back;
    @BindView(R.id.linearZakatFitrah)
    LinearLayout linearZakatFitrah;
    @BindView(R.id.linearZakatMall)
    LinearLayout linearZakatMall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zakat);
        ButterKnife.bind(this);

        setView();
    }

    private void setView() {
        back.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(i);
                return false;
            }
        });

    }

    @OnClick({R.id.back, R.id.linearZakatFitrah, R.id.linearZakatMall})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.back:
                onBackPressed();
                break;
            case R.id.linearZakatFitrah:
                startActivity(new Intent(getApplicationContext(), ZakatFitrah.class));
                break;
            case R.id.linearZakatMall:
                startActivity(new Intent(getApplicationContext(), ZakatMall.class));
                break;
        }
    }
}
