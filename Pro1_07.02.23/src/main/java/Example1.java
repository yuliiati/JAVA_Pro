public class Example1 {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Jenna");
        student1.setNumber(5);
        System.out.println(student1);

        Student student2 = new Student();
        student2.setName("John");
        student2.setNumber(10);
        System.out.println(student2);

        Student student3 = new Student();
        student3.setName("Maria");
        student3.setNumber(29);
        System.out.println(student3);

        Student student4 = new Student();
        student4.setName("James");
        student4.setNumber(9);
        System.out.println(student4);

    }
}
class Student {
    String name;
    int number;

    public void setName(String name) {
        this.name = name;
    }
    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return name + " " + number;
    }
}