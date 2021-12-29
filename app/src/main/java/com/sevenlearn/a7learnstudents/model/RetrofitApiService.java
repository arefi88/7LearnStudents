package com.sevenlearn.a7learnstudents.model;

import com.google.gson.JsonObject;

import java.util.List;

import io.reactivex.Single;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface RetrofitApiService {
    @GET("experts/student")
    Single<List<Student>> getStudents();

    @POST("experts/student")
    Single<Student> saveStudent(@Body JsonObject body);
}
