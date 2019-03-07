package AdvancedObjectOrientedDesign.animal;

import AdvancedObjectOrientedDesign.animal.fruit.Apple;
import AdvancedObjectOrientedDesign.animal.fruit.Fruit;
import AdvancedObjectOrientedDesign.animal.fruit.Orange;

public class AdstractAndIneterfaceTests {
    public static void main(String[] args) {
        //Phần kiểm thử Animal
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();

        for (Animal animal:animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Chicken edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }
        }
        //Phần kiểm thử Fruit
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits){
            System.out.println(fruit.howToEat());
        }

    }
}
