package com.example.rawrensia.northspineapp;

/**
 * Created by rawrensia on 30/8/18.
 */

public class Account {
    private String matric_num, password;
    public Account(String m, String p){
        matric_num = m;
        password = p;
    }

    public String getMatric_num() {return matric_num;}
    public String getPassword() {return password;}
}
