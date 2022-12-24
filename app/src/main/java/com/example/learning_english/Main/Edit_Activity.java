package com.example.learning_english.Main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

import Fragment.*;
import com.example.learning_english.R;

import java.util.ArrayList;
import java.util.List;

public class Edit_Activity extends AppCompatActivity {
    private List<Fragment>mFragments = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN| View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
        //透明状态栏
        getWindow().setStatusBarColor(Color.TRANSPARENT);
        //透明导航栏
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
        Intent intent = getIntent();
        String message = intent.getStringExtra("message");
        if(message.equals("add")){
            getSupportFragmentManager().beginTransaction().replace(R.id.edit_activity,new addFragment()).commit();
        }
        else if(message.equals("delete")){
            getSupportFragmentManager().beginTransaction().replace(R.id.edit_activity,new deleteFragment()).commit();
        }
        else if(message.equals("query")){
            getSupportFragmentManager().beginTransaction().replace(R.id.edit_activity,new queryFragment()).commit();
        }
        else if(message.equals("alter")){
            getSupportFragmentManager().beginTransaction().replace(R.id.edit_activity,new alterFragment()).commit();
        }
    }
}