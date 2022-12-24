package com.example.learning_english.Main;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.SurfaceControl;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

import com.Adapter.cet4_Adapter;
import com.Adapter.cet6_Adapter;
import com.Adapter.gre_Adapter;
import com.Adapter.ietsl_Adapter;
import com.Adapter.nmet_Adapter;
import com.example.learning_english.R;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;
import java.util.List;


import Fragment.*;


public class NewActivity extends FragmentActivity {
    private List<Fragment> fragments = new ArrayList<>();
    private TabLayout mTabLayout;
    private List<String> tablayoutdata = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN| View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
        //透明状态栏
        getWindow().setStatusBarColor(Color.TRANSPARENT);
        //透明导航栏
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
        mTabLayout = findViewById(R.id.tablayout);

        ViewPager2 viewPager2  = findViewById(R.id.viewPager2);
        Intent intent = getIntent();
        String id = intent.getStringExtra("tag");

        init();
        viewPager2.setAdapter(new cet4_Adapter(getSupportFragmentManager(),getLifecycle(),fragments));
        viewPager2.setAdapter(new cet6_Adapter(getSupportFragmentManager(),getLifecycle(),fragments));
        viewPager2.setAdapter(new gre_Adapter(getSupportFragmentManager(),getLifecycle(),fragments));
        viewPager2.setAdapter(new ietsl_Adapter(getSupportFragmentManager(),getLifecycle(),fragments));
        viewPager2.setAdapter(new nmet_Adapter(getSupportFragmentManager(),getLifecycle(),fragments));
        new TabLayoutMediator(mTabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                tab.setText(tablayoutdata.get(position));
            }
        }).attach();
    }
   public void init(){
    fragments.add(cet4_Fragment.newInstance("1","hao"));
    fragments.add(cet6_Fragment.newInstance("1","hao"));
    fragments.add(gre_Fragment.newInstance("1","hao"));
    fragments.add(ietsl_Fragment.newInstance("1","hao"));
    fragments.add(nmet_Fragment.newInstance("1","hao" ));
    tablayoutdata.add("cet4");
    tablayoutdata.add("cet6");
    tablayoutdata.add("gre");
    tablayoutdata.add("ietsl");
    tablayoutdata.add("nmet");
    }
}