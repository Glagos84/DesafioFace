package com.desafiolatam.desafioface.networks.users;

import com.desafiolatam.desafioface.models.Developer;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

/**
 * Created by Gabriel on 02-11-2017.
 */

public interface Users {

    @GET("users")
    Call<Developer[]> get(@QueryMap Map<String, String> queryMap);

}
