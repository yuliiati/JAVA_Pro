public class Example2 {
    public static void main(String[] args){
//        Fruit fruit = new Fruit();
        Ananas ananas = new Ananas();

    }
}
class Fruit {
    public Fruit() {
        System.out.println("Superclass hashcode: " + this.hashCode());
        System.out.println(this.getClass().getName());
    }
}
class Ananas extends Fruit {
    public Ananas() {
        System.out.println("Ananas hashcode: " + this.hashCode());
        System.out.println(this.getClass().getName());

        System.out.println("Superclass hashcode: " + super.hashCode());
        System.out.println(super.getClass().getName());
    }

}