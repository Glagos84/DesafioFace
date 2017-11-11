package com.desafiolatam.desafioface.views.login;

/**
 * Created by Gabriel on 02-11-2017.
 */

public interface SessionCallback {

    void requiredField();
    void mailFormat();
    void success();
    void failure();

}
