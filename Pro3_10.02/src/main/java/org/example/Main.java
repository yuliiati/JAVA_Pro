package org.example;

public class Main {

    public static void main(String[] args) {
       Box b1 = new Box(1.2, 2.3, 4.7);
//       b1.width = 12.9;
//        System.out.println(b1);
        b1.print();
        b1.setWidth(1.5);
        b1.print();

        Box b2 = new Box(8, 9, 5);
        b2.print();
        b2.setHeight(10);
        b2.print();
//        int a = 3.14; bad

//        Box b4 = null;

        Box b3 = b1;
        b3.print();
    }
}