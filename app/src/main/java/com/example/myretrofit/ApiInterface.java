package com.example.myretrofit;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;


public interface ApiInterface {
    @FormUrlEncoded
    @POST("upload_request.php")
    Call<ImageClass> uploadImage(@Field("title") String title,@Field("image") String image);
}
