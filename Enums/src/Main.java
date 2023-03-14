public class Main {
    public static void main(String[] args) {
        Transport transport = Transport.CAR;
        System.out.println("Duration: " + transport.getDurationInDays()); // Duration: 0 days, 6 hours, 30 minutes, 0 seconds
        System.out.println("Duration: " + transport.getDurationInHours()); // Duration: 6 hours, 30 minutes, 0 seconds
        System.out.println("Duration: " + transport.getDurationInMinutes()); // Duration: 390 minutes, 0 seconds
        System.out.println("Duration: " + transport.getDurationInSeconds()); // Duration: 23400 seconds

    }

}
