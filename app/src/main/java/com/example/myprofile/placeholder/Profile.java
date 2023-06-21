package com.example.myprofile.placeholder;

public class Profile {

    String image = "";
    String name = "";
    String height = "";
    String dob = "";
    String weight = "";
    String age = "";
    String hobby = "";

    public Profile(String image, String name, String height, String dob, String weight, String age, String hobby) {
        this.image = image;
        this.name = name;
        this.height = height;
        this.dob = dob;
        this.weight = weight;
        this.age = age;
        this.hobby = hobby;
    }

    public String getImage(){
        return image;
    }
    public void setImage(String image){
        this.image = image;
    }
    public String getName() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getdob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

}
