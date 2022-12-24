package com.example.learning_english.Main;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import com.Adapter.BannerAdapter;
import com.Adapter.banner;
import com.example.learning_english.R;
import com.youth.banner.Banner;
import com.youth.banner.indicator.CircleIndicator;

import java.util.ArrayList;
import java.util.List;





public class True_MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView cet4;
    private ImageView cet6;
    private ImageView gre;
    private ImageView ietsl;
    private ImageView nmet;
    private List<Integer>mList = new ArrayList<>();
    private Banner mBanner;
    private List<banner> mImageList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_true_main);
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN| View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
        //透明状态栏
        getWindow().setStatusBarColor(Color.TRANSPARENT);
        //透明导航栏
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
        cet4 = findViewById(R.id.iv_cet4);
        cet6 = findViewById(R.id.iv_cet6);
        gre = findViewById(R.id.iv_gre);
        ietsl  = findViewById(R.id.iv_ietsl);
        nmet = findViewById(R.id.iv_nmet);

        mImageList.add(new banner(R.mipmap.img));
        mImageList.add(new banner(R.mipmap.img));
        mImageList.add(new banner(R.mipmap.img));
        mImageList.add(new banner(R.mipmap.img));
        mImageList.add(new banner(R.mipmap.img));
        mImageList.add(new banner(R.mipmap.img));

        mBanner = findViewById(R.id.banner);
        mBanner.setAdapter(new BannerAdapter(True_MainActivity.this, mImageList));
        // Set Banner is auto to loop.
        mBanner.isAutoLoop(true);
        mBanner.setIndicator(new CircleIndicator(this));
        // Set an indicator for Banner.
        mBanner.start();
        mList.add(R.id.iv_cet4);
        mList.add(R.id.iv_cet6);
        mList.add(R.id.iv_gre);
        mList.add(R.id.iv_ietsl);
        mList.add(R.id.iv_nmet);

        cet4.setOnClickListener(this);
        cet6.setOnClickListener(this);
        gre.setOnClickListener(this);
        ietsl.setOnClickListener(this);
        nmet.setOnClickListener(this);

    }

    @Override
    protected void onStart() {
        super.onStart();
        mBanner.start();
    }

    @Override
    public void onClick(View v) {

           if(v.getId()==R.id.iv_cet4){
               Intent intent = new Intent(True_MainActivity.this, NewActivity.class);
               intent.putExtra("tag","CET4");
               v.getContext().startActivity(intent);
           }
           if(v.getId()==R.id.iv_cet6){
               Intent intent = new Intent(True_MainActivity.this, NewActivity.class);
               intent.putExtra("tag","CET6");
               v.getContext().startActivity(intent);
           }
        if(v.getId()==R.id.iv_gre){
            Intent intent = new Intent(True_MainActivity.this, NewActivity.class);
            intent.putExtra("tag","GRE");
            v.getContext().startActivity(intent);
        }
        if(v.getId()==R.id.iv_ietsl){
            Intent intent = new Intent(True_MainActivity.this, NewActivity.class);
            intent.putExtra("tag","IETSL");
            v.getContext().startActivity(intent);
        }
        if(v.getId()==R.id.iv_nmet){
            Intent intent = new Intent(True_MainActivity.this, NewActivity.class);
            intent.putExtra("tag","NMET");
            v.getContext().startActivity(intent);
        }


    }

}