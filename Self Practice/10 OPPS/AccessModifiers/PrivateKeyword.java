// private Keyword
public class PrivateKeyword {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Rajeshson";
        student1.percentage = 94.4;
        student1.rno = 01;

        System.out.println(student1.rno);
    }
}

class Student {
    String name;
    private int rno;
    double percentage;
}
