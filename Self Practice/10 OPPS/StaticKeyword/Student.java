public class Student {
    String name;
    int rno;
    double percent;
    final String schoolName = "BBS";
    private static int numberOfStudents;

    public Student() {

    }

    public Student(String name, int rno, double percent) { // this is constructor
        this.name = name;
        this.rno = rno;
        this.percent = percent;
        numberOfStudents++;
    }

    public static int getNumberOfStudents() {
        return numberOfStudents;
    }

    public static void main(String[] args) {

    }
}
