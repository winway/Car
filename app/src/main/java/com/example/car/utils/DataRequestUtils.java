package com.example.car.utils;

import com.example.car.bean.BrandBean;
import com.example.car.bean.ModelsBean;
import com.example.car.bean.SeriesBean;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * @PackageName: com.example.car.utils
 * @ClassName: DataRequestUtils
 * @Author: winwa
 * @Date: 2023/4/15 9:51
 * @Description:
 **/
public interface DataRequestUtils {

    public String KEY = "3164ac3caff4461b40f4fc8f2db500f5";
    public String BASE_URL = "http://apis.juhe.cn/cxdq/";

    @GET("brand")
    public Call<BrandBean> getBrand(@Query("key") String key, @Query("first_letter") String firstLetter);

    @GET("series")
    public Call<SeriesBean> getSeries(@Query("key") String key, @Query("brandid") String brandId);

    @GET("models")
    public Call<ModelsBean> getModels(@Query("key") String key, @Query("series_id") String seriesId);
}
