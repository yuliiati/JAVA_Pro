package HumanWorker;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Doctor();
        Worker worker2 = new FireMan();
        Worker worker3 = new PoliceMan();

        worker1.work();
        worker2.work();
        worker3.work();
    }
}
