package com.example.car;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.car.adapter.ModelsRecyclerAdapter;
import com.example.car.bean.ModelsBean;
import com.example.car.bean.SeriesBean;
import com.example.car.databinding.ActivityModelsBinding;
import com.example.car.utils.DataRequestUtils;
import com.example.car.utils.RetrofitUtils;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ModelsActivity extends AppCompatActivity {

    private ActivityModelsBinding mBinding;

    private ModelsRecyclerAdapter mModelsRecyclerAdapter;
    private List<ModelsBean.ResultBean> mModelsRecyclerData;

    public static Intent newIntent(Context context, SeriesBean.ResultBean bean) {
        Intent intent = new Intent(context, ModelsActivity.class);
        intent.putExtra("series", bean);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        SeriesBean.ResultBean model = (SeriesBean.ResultBean) intent.getSerializableExtra("series");

        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_models);

        initModelsRecyclerAdapter();

        mBinding.setTitle(model.getName());

        loadData(model.getId());
    }

    private void loadData(String id) {
        DataRequestUtils api = RetrofitUtils.getApi(DataRequestUtils.BASE_URL, DataRequestUtils.class);
        Call<ModelsBean> call = api.getModels(DataRequestUtils.KEY, id);
        call.enqueue(new Callback<ModelsBean>() {
            @Override
            public void onResponse(Call<ModelsBean> call, Response<ModelsBean> response) {
                ModelsBean body = response.body();
                mModelsRecyclerData.addAll(body.getResult());
                mModelsRecyclerAdapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<ModelsBean> call, Throwable t) {

            }
        });
    }

    private void initModelsRecyclerAdapter() {
        mModelsRecyclerData = new ArrayList<>();
        mModelsRecyclerAdapter = new ModelsRecyclerAdapter(this, mModelsRecyclerData);
        mBinding.setAdapter(mModelsRecyclerAdapter);
    }
}