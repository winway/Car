package com.example.car.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.car.R;
import com.example.car.bean.LogoBean;
import com.example.car.databinding.ItemRvBrandLogoBinding;

import java.util.List;

/**
 * @PackageName: com.example.car.adapter
 * @ClassName: LogoRecyclerAdapter
 * @Author: winwa
 * @Date: 2023/4/15 7:07
 * @Description:
 **/
public class LogoRecyclerAdapter extends RecyclerView.Adapter<LogoRecyclerAdapter.LogoViewHolder> {
    private Context mContext;
    private List<LogoBean.ResultBean> mData;

    public LogoRecyclerAdapter(Context context, List<LogoBean.ResultBean> data) {
        mContext = context;
        mData = data;
    }

    @NonNull
    @Override
    public LogoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemRvBrandLogoBinding dataBinding = DataBindingUtil.inflate(LayoutInflater.from(mContext), R.layout.item_rv_brand_logo, parent, false);
        LogoViewHolder viewHolder = new LogoViewHolder(dataBinding.getRoot());

        viewHolder.mBinding = dataBinding;

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull LogoViewHolder holder, int position) {
        LogoBean.ResultBean resultBean = mData.get(position);
        holder.mBinding.setItem(resultBean);
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    class LogoViewHolder extends RecyclerView.ViewHolder {
        ItemRvBrandLogoBinding mBinding = null;

        public LogoViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
