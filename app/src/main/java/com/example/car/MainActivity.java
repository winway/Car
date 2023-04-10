package com.example.car;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mNewsBTN;
    private Button mBrandBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNewsBTN = findViewById(R.id.main_news_btn);
        mBrandBTN = findViewById(R.id.main_brand_btn);

        mNewsBTN.setOnClickListener(this);
        mBrandBTN.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.main_news_btn:
                break;
            case R.id.main_brand_btn:
                startActivity(new Intent(this, BrandActivity.class));
                break;
        }
    }
}