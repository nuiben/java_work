// Main.java
class Main {

        // Animal.java
    abstract class Animal {
        public abstract void makeSound();
    }

    // Dog.java
    class Dog extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Bark bark..");
        }
    }

    // Cat.java
    class Cat extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Meow meow..");
        }
    }

    
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.makeSound();
        Cat c1 = new Cat();
        c1.makeSound();
    }
}