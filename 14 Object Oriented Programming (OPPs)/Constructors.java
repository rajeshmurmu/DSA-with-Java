public class Constructors {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Rajeshson");
        Student s3 = new Student(45);
        /*
         * Student s4 = new Student("Rajeshson",123); // this will give error because
         * there is no such type of constructors that contains parameter as string and
         * number;
         */
        System.out.println(s1.name);

    }
}

class Student {
    String name;
    int roll;

    // Constructors

    // Non-Parameterized
    Student() {
        System.out.println("Constructor is called");
    }

    // Parameterized
    Student(String name) {
        // System.out.println();
        this.name = name;
    }

    Student(int roll) {
        this.roll = roll;
    }

}
