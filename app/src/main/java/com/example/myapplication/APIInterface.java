package com.example.myapplication;

import com.example.myapplication.model.EmpData;

import retrofit2.Call;
import retrofit2.http.GET;

interface APIInterface {

    @GET("GetEmployeeData")
    Call<EmpData> doGetEmpData();

}