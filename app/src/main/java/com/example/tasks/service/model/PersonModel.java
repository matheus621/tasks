package com.example.tasks.service.model;

import androidx.room.Entity;

import com.google.gson.annotations.SerializedName;

@Entity
public class PersonModel {

    @SerializedName("token")
    private String token;
    @SerializedName("personKey")
    private String personKey;
    @SerializedName("name")
    private String name;

    public String getToken() {
        return token;
    }

    public String getPersonKey() {
        return personKey;
    }

    public String getName() {
        return name;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setPersonKey(String personKey) {
        this.personKey = personKey;
    }

    public void setName(String name) {
        this.name = name;
    }
}
