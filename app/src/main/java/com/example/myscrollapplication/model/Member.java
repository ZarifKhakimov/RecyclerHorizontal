package com.example.myscrollapplication.model;


import java.io.Serializable;

public class Member implements Serializable {

    private final int profile;
    private final String fullname;

    public int getProfile() {
        return profile;
    }

    public String getFullname() {
        return fullname;
    }

    public Member(int profile, String fullname){
        this.profile = profile;
        this.fullname = fullname;
    }

    @Override
    public String toString() {
        return "Member{" +
                "profile=" + profile +
                ", fullname='" + fullname + '\'' +
                '}';
    }
}
