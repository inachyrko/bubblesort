package com.company;

public class user {
    int id;
    String nano;

    public user(String nano) {
        this.nano = nano;
    }

    public user(int id) {
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNano(String nano) {
        this.nano = nano;
    }
}
