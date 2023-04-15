package com.example.car;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.car.adapter.LogoRecyclerAdapter;
import com.example.car.bean.LogoBean;
import com.example.car.databinding.ActivityBrandBinding;

import java.util.ArrayList;
import java.util.List;

public class BrandActivity extends AppCompatActivity {

    private ActivityBrandBinding mBinding;

    private LogoRecyclerAdapter mLogoRecyclerAdapter;
    private List<LogoBean.ResultBean> mLogoRecyclerData;

    private String mFirstLetter = "A";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brand);

        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_brand);

        initLogoRecyclerAdapter();

        refreshAdapter(mFirstLetter);

        mBinding.brandSearchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = mBinding.brandSearchEt.getText().toString().trim();
                if (!TextUtils.isEmpty(input) && !input.equals(mFirstLetter)) {
                    mFirstLetter = input;
                    refreshAdapter(mFirstLetter);
                }
            }
        });
    }

    private void initLogoRecyclerAdapter() {
        mLogoRecyclerData = new ArrayList<>();
        mLogoRecyclerAdapter = new LogoRecyclerAdapter(this, mLogoRecyclerData);

        mBinding.setAdapter(mLogoRecyclerAdapter);
    }

    private void refreshAdapter(String firstLetter) {
        mBinding.setBrandFirstLetter("当前品牌首字母：" + firstLetter);
    }
}