package com.example.blackcoffer_demo;

public class ProfileModel {
    int img;
    String name,city,occupation,range,attr1,attr2,attr3,status;

    public ProfileModel(int img,String name,String city,String occupation,String range,String attr1,String attr2,String attr3,String status){
        this.name= name;
        this.img= img;
        this.city= city;
        this.occupation=occupation;
        this.range=range;
        this.attr1=attr1;
        this.attr2=attr2;
        this.attr3=attr3;
        this.status=status;
    }
}
