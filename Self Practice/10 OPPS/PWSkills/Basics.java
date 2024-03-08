public class Basics {
    // 1
    // public static class Student {
    // String name;
    // int rno;
    // double percent;
    // }

    // public static void main(String[] args) {
    // Student s1 = new Student();
    // s1.name = "Rajeshson";
    // s1.rno = 76;
    // s1.percent = 95.5;
    // System.out.println(s1.name);
    // Student s2 = new Student();
    // s2.name = "Raghav";
    // s2.rno = 20;
    // s2.percent = 98.5;
    // }

    // 2 class Inside main function.

    // static class Student {
    // String name;
    // int rno;
    // double percent;
    // }

    // public static void fun(Student x) {
    // System.out.println(x.name);
    // }

    // public static void main(String[] args) {

    // Student s1 = new Student();
    // s1.name = "Rajeshson";
    // s1.rno = 76;
    // s1.percent = 95.5;
    // System.out.println(s1.name);

    // fun(s1);
    // }

    // Class pass in function by reference
    // static class Student {
    // String name;
    // int rno;
    // double percent;
    // }

    // class in different files
    // public static void change(Student s1) {
    // s1.name = "Rahul";
    // }

    // public static void main(String[] args) {
    // Student s1 = new Student();
    // s1.name = "Rajeshson";
    // s1.rno = 76;
    // s1.percent = 95.5;
    // System.out.println(s1.name);

    // // s1.name = "Rahul";
    // // System.out.println(s1.name);

    // change(s1);
    // System.out.println(s1.name);
    // }

    // Default properties/values of attributes in class

    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name);
        System.out.println(s.percent);
        System.out.println(s.rno);
    }
}