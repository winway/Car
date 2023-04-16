package com.example.car.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.car.R;
import com.example.car.bean.SeriesBean;
import com.example.car.databinding.ItemRvSeriesBinding;

import java.util.List;

/**
 * @PackageName: com.example.car.adapter
 * @ClassName: SeriesRecyclerAdapter
 * @Author: winwa
 * @Date: 2023/4/16 7:47
 * @Description:
 **/
public class SeriesRecyclerAdapter extends RecyclerView.Adapter<SeriesRecyclerAdapter.SeriesViewHolder> {

    private Context mContext;
    private List<SeriesBean.ResultBean> mData;

    public SeriesRecyclerAdapter(Context context, List<SeriesBean.ResultBean> data) {
        mContext = context;
        mData = data;
    }

    @NonNull
    @Override
    public SeriesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemRvSeriesBinding binding = DataBindingUtil.inflate(LayoutInflater.from(mContext), R.layout.item_rv_series, parent, false);
        SeriesViewHolder seriesViewHolder = new SeriesViewHolder(binding.getRoot());
        seriesViewHolder.mBinding = binding;
        return seriesViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SeriesViewHolder holder, int position) {
        SeriesBean.ResultBean bean = mData.get(position);
        holder.mBinding.setItem(bean);
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    class SeriesViewHolder extends RecyclerView.ViewHolder {

        ItemRvSeriesBinding mBinding = null;

        public SeriesViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
