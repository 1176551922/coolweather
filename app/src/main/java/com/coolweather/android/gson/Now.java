package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 沣沣最帅 on 2023/4/8.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("txt")
        public String info;

    }

}
