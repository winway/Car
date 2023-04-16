package com.example.car;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.car.adapter.SeriesRecyclerAdapter;
import com.example.car.bean.BrandBean;
import com.example.car.bean.SeriesBean;
import com.example.car.databinding.ActivitySeriesBinding;
import com.example.car.utils.DataRequestUtils;
import com.example.car.utils.RetrofitUtils;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SeriesActivity extends AppCompatActivity {

    private ActivitySeriesBinding mBinding;

    private SeriesRecyclerAdapter mSeriesRecyclerAdapter;
    private List<SeriesBean.ResultBean> mSeriesRecyclerData;

    public static Intent newIntent(Context context, BrandBean.ResultBean bean) {
        Intent intent = new Intent(context, SeriesActivity.class);
        intent.putExtra("brand", bean);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        BrandBean.ResultBean brand = (BrandBean.ResultBean) intent.getSerializableExtra("brand");

        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_series);

        initSeriesRecyclerAdapter();

        mBinding.setTitle(brand.getBrand_name());

        loadData(brand.getId());
    }

    private void loadData(String id) {
        DataRequestUtils api = RetrofitUtils.getApi(DataRequestUtils.BASE_URL, DataRequestUtils.class);
        Call<SeriesBean> call = api.getSeries(DataRequestUtils.KEY, id);
        call.enqueue(new Callback<SeriesBean>() {
            @Override
            public void onResponse(Call<SeriesBean> call, Response<SeriesBean> response) {
                SeriesBean body = response.body();
                mSeriesRecyclerData.addAll(body.getResult());
                mSeriesRecyclerAdapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<SeriesBean> call, Throwable t) {

            }
        });
    }

    private void initSeriesRecyclerAdapter() {
        mSeriesRecyclerData = new ArrayList<>();
        mSeriesRecyclerAdapter = new SeriesRecyclerAdapter(this, mSeriesRecyclerData);
        mBinding.setAdapter(mSeriesRecyclerAdapter);
    }
}