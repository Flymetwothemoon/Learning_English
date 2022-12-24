package com.example.learning_english.Main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.example.learning_english.R;

public class ManagerActivity extends AppCompatActivity implements View.OnClickListener {
    private Button add;
    private Button delete;
    private Button alter;
    private Button query;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manager);
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN| View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
        //透明状态栏
        getWindow().setStatusBarColor(Color.TRANSPARENT);
        //透明导航栏
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
        add =findViewById(R.id.add);
        delete = findViewById(R.id.delete);
        alter = findViewById(R.id.alter);
        query = findViewById(R.id.query);
        add.setOnClickListener(this);
        delete.setOnClickListener(this);
        alter.setOnClickListener(this);
        query.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(ManagerActivity.this,Edit_Activity.class);
        if(v.getId()==R.id.add){
           intent.putExtra("message","add");
        }
        else if(v.getId()==R.id.delete){
            intent.putExtra("message","delete");
        }
        else if(v.getId()==R.id.alter){
            intent.putExtra("message","alter");
        }
        else if(v.getId()==R.id.query){
            intent.putExtra("message","query");
        }
        startActivity(intent);
    }
}