package com.zhy.center.model;

/**
 * @author Lenovo
 * @version 1.0
 * @description TODO
 * @date 17/5/2023 下午6:38
 */

public class User {
    private Integer id;
    private String username;
    private String password;
    private String userMail;
    private String userPhone;

    public User(String pwd, String phone, String email) {
    }

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }


    public User(Integer id) {
        this.id = id;
    }

    public User(String username) {
        this.username = username;
    }

    public User(Integer id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public User(Integer id, String username, String password, String userMail, String userPhone) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.userMail = userMail;
        this.userPhone = userPhone;
    }

    public User() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }
}
