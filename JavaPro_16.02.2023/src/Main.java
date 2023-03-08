public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < DaysOfWeeks.values().length; i++) {
            System.out.println(
                    DaysOfWeeks.valueOf(DaysOfWeeks.values()[i].toString())
                            + " " +
                            DaysOfWeeks.valueOf(DaysOfWeeks.values()[i].toString()).getPrice()
            );
        }

        for (int i = 0; i < DaysOfWeeks.values().length; i++) {
            System.out.println(
                    DaysOfWeeks.values()[i]
                            + " " +
                            DaysOfWeeks.values()[i].getPrice()
            );
        }

//        for (DaysOfWeeks d : DaysOfWeeks.values()) {
//            System.out.println(
//                    d + " " + d.getPrice()
//            );
//        }
//        System.out.println("Hello world!");
    }
}