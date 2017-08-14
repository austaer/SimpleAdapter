package com.example.simpleadpter.model;

/**
 * Created by Administrator on 2017/7/6.
 */

public class User {
    private String name;
    private int avatar;
    private String location;
    private int prefer;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getPrefer() {
        return prefer;
    }

    public void setPrefer(int prefer) {
        this.prefer = prefer;
    }
}
