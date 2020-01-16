package com.example.admin.retrofitget;

/**
 * Created by admin on 9/16/2019.
 */

public class DataSet {

     String name;
     String hobby;

    public DataSet() {
    }

    public DataSet(String name, String hobby) {
        this.name = name;
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
