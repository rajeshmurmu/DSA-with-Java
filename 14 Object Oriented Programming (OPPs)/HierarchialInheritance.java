public class HierarchialInheritance {
    public static void main(String[] args) {

    }
}

class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

class Mammal extends Animal {
    void walks() {
        System.out.println("Walks");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("flies");
    }
}

class Fish extends Animal {
    void swim() {
        System.out.println("swims");
    }
}
