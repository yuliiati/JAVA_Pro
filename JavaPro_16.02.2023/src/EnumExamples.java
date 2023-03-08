import java.util.Arrays;

public class EnumExamples {
    public static void main(String[] args) {

//        for (int i = 0; i < DaysOfWeeks.values().length; i++) {
//            System.out.println(
//                            DaysOfWeeks.values()[i]
//                            + " " +
//                            DaysOfWeeks.values()[i].getPrice()
//            );
//        }

        for (DaysOfWeeks d : DaysOfWeeks.values()) {
            System.out.println(
                    d + " " + d.getPrice()
            );
        }
    }
}

enum DaysOfWeeks {
    MO(10), TU (11),
    WE(12), TH(13),
    FR(14), SA(15),
    SU(16);

    private int price;

    DaysOfWeeks(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

interface TTTTT {
    void print();
}

interface AAAAA {
    void printResult();
}