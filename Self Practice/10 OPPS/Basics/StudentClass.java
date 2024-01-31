public class StudentClass {

    // Creating data type (Student)
    public static class Student {
        String name;
        int rno;
        double precent;
    }

    public static class Car {
        String name;
        String type;
        int price;
    }

    public static void fun(Student c) {
        System.out.println(c.name);
    }

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.name = "Raghav";
        student1.rno = 76;
        student1.precent = 92.5;

        Student student2 = new Student();
        student2.name = "Rajeshson";
        student2.rno = 22;
        student2.precent = 90.2;

        Car car1 = new Car();
        car1.name = "Alto";
        car1.type = "hatchback";
        car1.price = 4000000;

        // System.out.println(car1.name);
        fun(student1);
    }
}