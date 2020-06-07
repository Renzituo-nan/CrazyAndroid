package com.plkj.studysample.retrofit;


import android.database.Observable;

import com.plkj.studysample.Person;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Renzituo
 * on 2020-05-08
 */
public interface IRequest {
    @GET("....")
    Call<Person> getPerson();//原生使用

    @GET("....")
    Observable<Person> getPerson2();//配合RxJava的使用
}
