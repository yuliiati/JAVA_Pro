package Lesson_1_24_02_23;

import javax.swing.*;

public class Dog {
    String breed;
    int age;    // Пер-я int по умолчанию 0
    Spring color;
    String name;
    public Dog(){
        System.out.println("Вызван конструктор Dog");
    }
    public Dog(String name){
        this.name = name;
        System.out.println("Вызван конструктор с параметром name");
    }
    public Dog(int age){
        this.age = age;
        System.out.println("Вызван конструктор с параметром age");
    }
    public Dog(int age, String color){
//        this.age = age;
//        this.color = color;
        System.out.println("Вызван конструктор с 2 параметрами age, color");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Spring getColor() {
        return color;
    }

    public void setColor(Spring color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected void bark(){
        System.out.println(name + " лает: Woof!");

    }
    void sleep(){

    }
    void walk(){

    }
}
