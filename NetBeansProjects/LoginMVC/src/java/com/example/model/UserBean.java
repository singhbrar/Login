/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.model;

/**
 *
 * @author asi
 */
public class UserBean {
    private String username="Stephen";
    private String password="Stephen";
    public boolean isValidUser(String User,String pass)
    {
        return this.password.equals(pass)&&this.username.equals(User);
    }
}
