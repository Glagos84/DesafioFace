package com.desafiolatam.desafioface.networks.sessions;

import com.desafiolatam.desafioface.models.CurrentUser;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by Gabriel on 02-11-2017.
 */

public interface Session {

    @FormUrlEncoded
    @POST("mobile_sessions")
    Call<CurrentUser> loggin (@Field("session[email]") String email , @Field("session[password]")String password);
}
