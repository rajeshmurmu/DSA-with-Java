public class Polymerphism {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.sum(1, 2));
        System.out.println(calc.sum(1.5f, 2.5f));
        System.out.println(calc.sum(1, 2, 3));

        Deer d = new Deer();

        d.eat();
    }
}

// Methood OverLoading / Compile time polymerphism
class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

}

// Methood OverRiding / Compile time polymerphism

class Animal {
    void eat() {
        System.out.println("Eat EveryThing.");
    }
}

class Deer extends Animal {
    void eat() {
        System.out.println("Eats Grass");
    }
}
