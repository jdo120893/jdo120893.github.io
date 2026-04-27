package day07;

import jdk.swing.interop.SwingInterOpUtils;

public class Zoo {
    public static void main(String[] args) {

        Animal[] animals = new Animal[3];

        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Animal();

        System.out.println("=== 동물들 ===");
        for(Animal animal: animals){
            animal.makeSound();
            animal.move();
            System.out.println("---");
        }

        for(Animal animal: animals){
            if(animal instanceof Dog){
                Dog dog = (Dog) animal;
                dog.wagTail();
            }
            else if(animal instanceof Cat){
                Cat cat = (Cat) animal;
                cat.scratch();
            }

        }
        }
    }
