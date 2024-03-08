public class FinalKeyword {

    public static void main(String[] args) {
        Student s1 = new Student("Rajeshson", 20, 98.99);
        System.out.println("Name: " + s1.name);
        System.out.println("Roll No:" + s1.rno);
        System.out.println("Percentage:" + s1.percent);
        System.out.println("College:" + s1.college);

        Student s2 = new Student();
        System.out.println(s2.college);

    }
}
