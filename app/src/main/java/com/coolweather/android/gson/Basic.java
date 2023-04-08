package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 沣沣最帅 on 2023/4/8.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{

        @SerializedName("loc")
        public String updateTime;

    }
}
