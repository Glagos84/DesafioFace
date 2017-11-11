package com.desafiolatam.desafioface.data;

import com.desafiolatam.desafioface.models.CurrentUser;

/**
 * Created by Gabriel on 03-11-2017.
 */

public class CurrentUserQuery {

    public boolean isLogged(){

        return CurrentUser.listAll(CurrentUser.class).size() > 0;
    }

    public CurrentUser get(){

        return CurrentUser.listAll(CurrentUser.class).get(0);

    }

}
