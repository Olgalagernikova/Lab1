package com.company;

public abstract class Product implements ICrudAction {
    static int count=0;
    int id;
    String name;
    String code;
    float price;
    String manufacturer;

    Product(){
        
    }


}
