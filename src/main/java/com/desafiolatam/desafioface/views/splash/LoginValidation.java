package com.desafiolatam.desafioface.views.splash;

import com.desafiolatam.desafioface.data.CurrentUserQuery;

/**
 * Created by Gabriel on 02-11-2017.
 */

public class LoginValidation {

    private LoginCallback callback;

    public LoginValidation() {
    }

    public LoginValidation(LoginCallback callback) {
        this.callback = callback;
    }

    public void init(){
        if (new CurrentUserQuery().isLogged()){
            callback.signed();
        }else {
            callback.signUp();

        }


    }

}
