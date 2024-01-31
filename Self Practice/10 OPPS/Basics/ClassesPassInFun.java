public class ClassesPassInFun {

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
        student1.name = "Raghav";
        student1.rno = 76;
        student1.precent = 92.5;

        System.out.println(student1.name);
        change(student1);
        System.out.println(student1.name);
    }
}
