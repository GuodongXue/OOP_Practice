package com.gdx.practice;

public class bird extends animal{
    String color;

    public String getColor() {
        return color;
    }

    public bird() {
    }

    public bird(int age, String color) {
        super(age);
        this.color = color;
    }
    public void fly(){
        System.out.println("I can fly");
    }
    public String show(){
        return "I am a "+ color + " bird, and I am "+this.getAge()+ "years old.";
    }
}
