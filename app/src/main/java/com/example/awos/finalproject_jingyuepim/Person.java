package com.example.awos.finalproject_jingyuepim;

/**
 * Created by Admin on 4/30/18.
 */

public class Person {
    public String name;
    public int photoId;

    public Person(String name, int photoId){
        this.name=name;
        this.photoId=photoId;
    }

    public int getPhotoId() {
        return photoId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }
}
