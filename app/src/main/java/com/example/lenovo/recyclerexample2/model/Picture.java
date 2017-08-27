package com.example.lenovo.recyclerexample2.model;

public class Picture {

     int image;
     String name;

     Picture(String name, int image) {
        this.name = name;
        this.image = image;
    }


    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }

}

