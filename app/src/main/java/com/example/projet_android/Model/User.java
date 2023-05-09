package com.example.projet_android.Model;

public class User {

    private String name;
    private String email;
    private String username;
    private String bio;
    private String id;

    public User() {

    }

    public User(String fullname, String email, String name, String bio, String id) {
        this.name = name;
        this.email = email;
        this.username = username;
        this.bio = bio;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
