package com.example.car.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.car.R;
import com.example.car.SeriesActivity;
import com.example.car.bean.BrandBean;
import com.example.car.databinding.ItemRvBrandBinding;

import java.util.List;

/**
 * @PackageName: com.example.car.adapter
 * @ClassName: LogoRecyclerAdapter
 * @Author: winwa
 * @Date: 2023/4/15 7:07
 * @Description:
 **/
public class BrandRecyclerAdapter extends RecyclerView.Adapter<BrandRecyclerAdapter.BrandViewHolder> {
    private Context mContext;
    private List<BrandBean.ResultBean> mData;

    public BrandRecyclerAdapter(Context context, List<BrandBean.ResultBean> data) {
        mContext = context;
        mData = data;
    }

    public void refreshData(List<BrandBean.ResultBean> beanList) {
        if (beanList != null) {
            mData.addAll(beanList);
            notifyDataSetChanged();
        }
    }

    @NonNull
    @Override
    public BrandViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemRvBrandBinding dataBinding = DataBindingUtil.inflate(LayoutInflater.from(mContext), R.layout.item_rv_brand, parent, false);
        BrandViewHolder viewHolder = new BrandViewHolder(dataBinding.getRoot());

        viewHolder.mBinding = dataBinding;

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull BrandViewHolder holder, int position) {
        BrandBean.ResultBean resultBean = mData.get(position);
        holder.mBinding.setItem(resultBean);

        holder.mBinding.getRoot().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = SeriesActivity.newIntent(mContext, resultBean);
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    class BrandViewHolder extends RecyclerView.ViewHolder {
        ItemRvBrandBinding mBinding = null;

        public BrandViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
