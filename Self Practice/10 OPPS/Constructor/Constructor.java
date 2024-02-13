public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student("Rajeshson", 20, 90.00);
        System.out.println(s1.name);
        System.out.println(s1.rno);
        System.out.println(s1.percent);

        Student s2 = new Student("munna", 20, 58.005);
        System.out.println(s2.name);
        System.out.println(s2.rno);
        System.out.println(s2.percent);

        Student s3 = new Student();
        s3.name = "Munshi";
        s3.percent = 88.201;
        s3.rno = 88;

        System.out.println(s3.name);
        System.out.println(s3.rno);
        System.out.println(s3.percent);

        // s1.schoolName = "ABC";
        System.out.println(s2.schoolName);
    }
}
