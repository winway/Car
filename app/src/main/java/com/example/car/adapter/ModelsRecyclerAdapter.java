package com.example.car.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.car.R;
import com.example.car.bean.ModelsBean;
import com.example.car.databinding.ItemRvModelsBinding;

import java.util.List;

/**
 * @PackageName: com.example.car.adapter
 * @ClassName: ModelsRecyclerAdapter
 * @Author: winwa
 * @Date: 2023/4/16 7:47
 * @Description:
 **/
public class ModelsRecyclerAdapter extends RecyclerView.Adapter<ModelsRecyclerAdapter.ModelsViewHolder> {

    private Context mContext;
    private List<ModelsBean.ResultBean> mData;

    public ModelsRecyclerAdapter(Context context, List<ModelsBean.ResultBean> data) {
        mContext = context;
        mData = data;
    }

    @NonNull
    @Override
    public ModelsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemRvModelsBinding binding = DataBindingUtil.inflate(LayoutInflater.from(mContext), R.layout.item_rv_models, parent, false);
        ModelsViewHolder holder = new ModelsViewHolder(binding.getRoot());
        holder.mBinding = binding;
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ModelsViewHolder holder, int position) {
        ModelsBean.ResultBean bean = mData.get(position);
        holder.mBinding.setItem(bean);
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    class ModelsViewHolder extends RecyclerView.ViewHolder {

        ItemRvModelsBinding mBinding = null;

        public ModelsViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
