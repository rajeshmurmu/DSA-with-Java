/*
 * Public - all packages
 * Private - same class
 * Default - same package
 */

public class AccessModifiers {

    public static class Student {
        String name;
        int rno;
        double precent;
    }

    public static void change(Student s) {
        s.name = "abc";
    }

    public static void main(String[] args) {
        Student student1 = new Student();

        System.out.println(student1.precent);
    }
}
