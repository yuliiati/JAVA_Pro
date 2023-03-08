package Lesson_2_03_03_23;

public class Cat extends Mammal {
    private String name;
    public static int pawsCount = 4;
    public Cat() {

    }
    public Cat(String name) {
        this.name = name;
    }
//    @Override
//    public String

    public String getName() {
        return name;
    }
}
