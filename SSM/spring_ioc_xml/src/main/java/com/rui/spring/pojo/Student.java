package com.rui.spring.pojo;

import java.util.Arrays;
import java.util.Map;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/4/24 9:31
 * @Version 1.0
 */
public class Student {

    private Integer sid;
    private String sname;
    private Integer age;
    private String gender;
    private Double score;
    private String[] hobby;
    private Map<String,Teacher> teacherMap;
    private Clazz clazz;

    public Student() {
    }

    public Student(Integer sid, String sname, String gender,Integer age) {
        this.sid = sid;
        this.sname = sname;
        this.gender = gender;
        this.age = age;

    }

    public Student(Integer sid, String sname, String gender,Double score) {
        this.sid = sid;
        this.sname = sname;
        this.gender = gender;
        this.score = score;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Clazz getClazz() {
        return clazz;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    public Map<String, Teacher> getTeacherMap() {
        return teacherMap;
    }

    public void setTeacherMap(Map<String, Teacher> teacherMap) {
        this.teacherMap = teacherMap;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", score=" + score +
                ", hobby=" + Arrays.toString(hobby) +
                ", teacherMap=" + teacherMap +
                ", clazz=" + clazz +
                '}';
    }
}
