package com.example.car.utils;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @PackageName: com.example.car.utils
 * @ClassName: RetrofitUtils
 * @Author: winwa
 * @Date: 2023/4/15 9:17
 * @Description:
 **/
public class RetrofitUtils {
    private static Retrofit mRetrofit = null;

    public static <T> T getApi(String baseUrl, Class<T> cls) {
        Retrofit retrofit = getRetrofit(baseUrl);
        return retrofit.create(cls);
    }

    public static Retrofit getRetrofit(String baseUrl) {
        if (mRetrofit == null) {
            mRetrofit = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return mRetrofit;
    }
}
