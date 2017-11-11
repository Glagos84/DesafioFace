package com.desafiolatam.desafioface.models;

import com.orm.SugarRecord;

/**
 * Created by Gabriel on 02-11-2017.
 */

public class BaseSugar extends SugarRecord{

    private long server_id;

    public BaseSugar() {
    }

    public long getServer_id() {
        return server_id;
    }

    public void setServer_id(long server_id) {
        this.server_id = server_id;
    }

    public void create(){
        setServer_id(getId());
        setId(null);
        save();
    }

    @Override
    public long save() {
        return super.save();
    }
}
