public class StaticKeyword {
    // Static Keyword is a shared variable, It can be declare one time for all
    // objects in a class.

    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.noOfStudent);
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();

        System.out.println(Student.noOfStudent);
        System.out.println(s1.noOfStudent);
    }
}
