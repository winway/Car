package com.example.car;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.car.adapter.BrandRecyclerAdapter;
import com.example.car.bean.BrandBean;
import com.example.car.databinding.ActivityBrandBinding;
import com.example.car.utils.DataRequestUtils;
import com.example.car.utils.RetrofitUtils;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BrandActivity extends AppCompatActivity {

    private ActivityBrandBinding mBinding;

    private BrandRecyclerAdapter mBrandRecyclerAdapter;
    private List<BrandBean.ResultBean> mBrandRecyclerData;

    private String mFirstLetter = "A";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brand);

        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_brand);

        initLogoRecyclerAdapter();

        refreshData(mFirstLetter);

        mBinding.brandSearchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = mBinding.brandSearchEt.getText().toString().trim();
                if (!TextUtils.isEmpty(input) && !input.equals(mFirstLetter)) {
                    mFirstLetter = input;
                    refreshData(mFirstLetter);
                }
            }
        });
    }

    private void initLogoRecyclerAdapter() {
        mBrandRecyclerData = new ArrayList<>();
        mBrandRecyclerAdapter = new BrandRecyclerAdapter(this, mBrandRecyclerData);

        mBinding.setAdapter(mBrandRecyclerAdapter);
    }

    private void refreshData(String firstLetter) {
        mBinding.setBrandFirstLetter("当前品牌首字母：" + firstLetter);

        loadData(firstLetter);
    }

    private void loadData(String firstLetter) {
        DataRequestUtils api = RetrofitUtils.getApi(DataRequestUtils.BASE_URL, DataRequestUtils.class);
        Call<BrandBean> call = api.getBrand(DataRequestUtils.KEY, firstLetter);
        call.enqueue(new Callback<BrandBean>() {
            @Override
            public void onResponse(Call<BrandBean> call, Response<BrandBean> response) {
                BrandBean body = response.body();
                mBrandRecyclerData.clear();
                mBrandRecyclerAdapter.refreshData(body.getResult());
            }

            @Override
            public void onFailure(Call<BrandBean> call, Throwable t) {

            }
        });
    }
}