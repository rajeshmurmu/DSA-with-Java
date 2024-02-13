public class StaticKeyword {
    public static void main(String[] args) {
        // System.out.println(Student.numberOfStudents);
        // System.out.println(Student.getNumberOfStudents());

        Student s1 = new Student("Rajeshson", 15, 90.528);
        Student s2 = new Student("Munshi", 20, 80.58);
        Student s3 = new Student("Sujit", 22, 85.58);

        System.out.println(s1.getNumberOfStudents());
        System.out.println(s2.getNumberOfStudents());
        System.out.println(s3.getNumberOfStudents());

    }
}
