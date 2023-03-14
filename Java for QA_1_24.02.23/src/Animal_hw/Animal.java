package Animal_hw;

// 1. Даны классы - Herbivore, Cheetah, Cow, Carnivore, Tiger, Animal, Goat.
//Создайте логически правильную иерархию наследования, нужные классы сделайте абстрактными.

abstract class Animal {
    public void sleep() {
        System.out.println("Я сплю");
    }
}
/*

Классы Cow и Goat наследуют от класса Herbivore, и имеют методы eatPlants, которые характерны только для травоядных,
а также методы moo и climb, специфичные для каждого из животных. Классы Tiger и Cheetah наследуют от класса Carnivore,
и имеют методы hunt, которые характерны только для хищников, а также методы roar и runFast,
специфичные для каждого из животных.

*/