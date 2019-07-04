package com.company;
import java.lang.Math;
import java.util.Scanner;
import java.util.UUID;

public abstract class Product implements ICrudAction {
    static int count = 0;
    UUID id;
    String name;
    String code;
    float price;
    String manufacturer;

    public Product(){
        id=UUID.randomUUID();
    }

    @Override
    public void create(){
        count++;
        //id=(int)(Math.random() * 100);
        price=(float)(Math.random() * 10000);
        //name
        //code
        //manufacturer

    }

    @Override
    public void read(){
        System.out.println("ID товара: " + id);
        System.out.println("Название: " + name);
        System.out.println("Артикул: " + code);
        System.out.println("Цена: " + price);
        System.out.println("Производитель: " + manufacturer);
    }

    @Override
    public void update(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите название товара: ");
        if(sc.hasNextLine()) {
            name = sc.nextLine();

        } else {
            System.out.println("Неверный формат!");
        }

        System.out.print("Введите артикул товара: ");
        if(sc.hasNextLine()) {
            code = sc.nextLine();

        } else {
            System.out.println("Неверный формат!");
        }


        System.out.print("Введите цену товара: ");
        if(sc.hasNextFloat()) {
            price = sc.nextFloat();

        } else {
            System.out.println("Неверный формат!");
        }


        System.out.print("Введите производитель товара: ");
        if(sc.hasNextLine()) {
            manufacturer = sc.nextLine();

        } else {
            System.out.println("Неверный формат!");
        }

    }

    @Override
    public void delete(){
        count--;
        name="";
        code="";
        price=0;
        manufacturer="";
    }

}
