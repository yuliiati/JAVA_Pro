//import org.example.Animal;

public class InheritanceExamples {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.voice();

        Dog dog = new Dog();
        dog.voice();

        Shepherd shepard = new Shepherd();
        shepard.voice();

        Bird bird = new Bird();
        bird.voice();
        bird.fly();
        bird.eat();

        Parrot parrot = new Parrot();
        parrot.voice();
        parrot.fly();
        parrot.eat();
    }
}
 class Animal {
    public void voice() {
        System.out.println("Voice-voice");
    }
}

class Dog extends Animal {
    @Override
    public void voice() {
        System.out.println("Bark-Bark");
    }

public void animalMethod() {   // Что это

}
}
class Bird extends Animal implements Flying, Eating {
    @Override
    public void voice() {
        System.out.println("Trululu"); // Уровень программирования :D
    }

    @Override
    public void fly() {
        System.out.println("fly skill was added");
    }

    @Override
    public void eat() {
        System.out.println("eat skill was added");
    }
}
class Parrot extends Animal {
    @Override
    public void voice() {
        System.out.println("Chikchirik"); // Уровень программирования :D
    }

    public void eat() { //
    }

    public void fly() { //
    }
}

class Shepherd extends Dog { // Нем овчарка:)
    @Override
    public void voice() {
        System.out.println("Bark-Shepherd-Bark");
    }
}

// -> направление в сторону дочернего класса

// Shepherd <- Dog <- Animal <<- многоуровневое наследование (Animal и Dog - одноуровневое!)
// Bird <- Animal -> Dog    <- иерархичесий сценарий наследования

interface Flying {
    void fly();
}
interface Eating {
    void eat();
}