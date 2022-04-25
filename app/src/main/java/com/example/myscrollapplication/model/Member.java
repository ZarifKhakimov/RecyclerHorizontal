package com.example.myscrollapplication.model;

public class Member {

    private int profile;
    private String fullname;

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
                ", fullName='" + fullname + '\'' +
                '}';
    }
}
