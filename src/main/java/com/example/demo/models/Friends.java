package com.example.demo.models;


public class Friends {

    private int id;
    private String adress;
    private String name;
    private String phoneNumber;


    public Friends() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getPhoneNumber(){
        return phoneNumber; 
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber; 
    }
    public Friends(int id, String adress, String name, String phoneNumber) {
        this.id = id;
        this.adress = adress;
        this.name = name;
        this.phoneNumber = phoneNumber; 

    }
}

