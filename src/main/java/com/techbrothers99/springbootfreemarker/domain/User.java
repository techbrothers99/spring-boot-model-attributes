/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techbrothers99.springbootfreemarker.domain;

/**
 *
 * @author chiru
 */
public class User {
    
    private String name;
    private int age;
    private String emailId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public String toString() {
        return "User{" + "name=" + name + ", age=" + age + ", emailId=" + emailId + '}';
    }
    
      
    
}
