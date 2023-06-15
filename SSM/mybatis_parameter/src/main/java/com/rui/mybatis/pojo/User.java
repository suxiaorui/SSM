package com.rui.mybatis.pojo;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/4/21 16:36
 * @Version 1.0
 */
public class User {
    private Integer id;
    private String username;
    private Integer age;
    private String password;

    public User(Integer id, String username, Integer age,String password) {
        this.id = id;
        this.username = username;
        this.age = age;
        this.password = password;
    }
    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public Integer getAge() {
        return age;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(Integer age) {
        this.age = age;
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
                ", age=" + age +
                ", password='" + password + '\'' +
                '}';
    }
}
