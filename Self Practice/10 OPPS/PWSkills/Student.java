public class Student {
    String name;
    int rno;

    // used for private keyword
    // private int rno;
    double percent;

    // used for final keyword;
    final String college = "Pinnacle Degree College";

    // used for Static Keyword
    static int noOfStudent = 0;

    Student(String name, int rno, double percent) {
        this.name = name;
        this.rno = rno;
        this.percent = percent;
        noOfStudent++;
    }

    Student() {
        noOfStudent++;
    }

    public static void main(String[] args) {
        // Student s1 = new Student();
        // s1.rno = 20;
        // System.out.println(s1.rno);
    }
}
