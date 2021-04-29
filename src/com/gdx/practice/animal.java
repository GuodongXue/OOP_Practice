package com.gdx.practice;

public class animal {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String show(){
        return "I can introduce myself.";
    }

    public animal() {
    }

    public animal(int age) {
        this.age = age;
    }
}
