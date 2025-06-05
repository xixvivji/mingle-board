package com.example.springsever.entity;

public class User {
    private Long id;
    private String username;
    private String password;


    // 생성자, 게터, 세터 등 필요한 메서드 추가

    public User() {
        // 기본 생성자
    }

    public User(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
