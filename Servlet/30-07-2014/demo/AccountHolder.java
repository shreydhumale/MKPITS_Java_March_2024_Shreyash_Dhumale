package com.demo;

public class AccountHolder {
    private int userid;
    private String name;
    private String email;
    private String password;
    private double balance;

    public int getUserid(){
        return userid; 
    }
    public void setUserid(int userid) { 
        this.userid = userid; 
    }
    public String getName(){ 
        return name; 
    }
    public void setName(String name){
        this.name = name; 
    }
    public String getEmail(){
        return email; 
    }
    public void setEmail(String email){
        this.email = email; 
    }
    public String getPassword(){ 
        return password; 
    }
    public void setPassword(String password){ 
        this.password = password; 
    }
    public double getBalance(){ 
        return balance; 
    }
    public void setBalance(double balance){ 
        this.balance = balance; 
    }
}
