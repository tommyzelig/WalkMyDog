package com.homeproject.walkmydogprojectgis;

public class User {


    private String user_id;
    private String fullName;
    private String email;
    private String password;
    private String dogName;

    public User(String user_id, String fullName, String email, String password, String dogName) {
        this.user_id = user_id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.dogName = dogName;
    }

    public User() {
        // empty constructor
    }

    public String getUser_id() {return user_id;}

    public void setUser_id(String user_id) {this.user_id = user_id;}

    public String getFullName() {return fullName;}

    public void setFullName(String fullName) {this.fullName = fullName;}

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}

    public String getPassword() {return password;}

    public void setPassword(String password) {this.password = password;}

    public String getDogName() {return dogName;}

    public void setDogName(String dogName) {this.dogName = dogName;}
}
