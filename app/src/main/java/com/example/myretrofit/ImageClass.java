package com.example.myretrofit;

import com.google.gson.annotations.SerializedName;

import okhttp3.Response;

public class ImageClass {
    @SerializedName("title")
    private String Title;

    @SerializedName("image")
    private String Image;

    @SerializedName("response")
    private String Response;

    public  String getResponse(){
        return Response;
    }
}
