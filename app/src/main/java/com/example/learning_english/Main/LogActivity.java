package com.example.learning_english.Main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.learning_english.R;

public class LogActivity extends AppCompatActivity {
    private Button mButton;
    private EditText mEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN| View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
        //透明状态栏
        getWindow().setStatusBarColor(Color.TRANSPARENT);
        //透明导航栏
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);

        mEditText = findViewById(R.id.edittext);
        mButton = findViewById(R.id.button1);


            mButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(mEditText.getText().toString().equals("1")) {
                        Intent intent = new Intent(LogActivity.this, True_MainActivity.class);
                        startActivity(intent);
                    }
                    else if(mEditText.getText().toString().equals("2")){
                        Intent intent = new Intent(LogActivity.this,ManagerActivity.class);
                        startActivity(intent);
                    }
                }
            });
        }

}