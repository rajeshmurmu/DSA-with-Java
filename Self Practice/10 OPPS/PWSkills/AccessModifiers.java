public class AccessModifiers {
    // public :- access in all packeges
    // private same class;
    // default same packeges

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rno = 21;
        System.out.println(s1.rno);
    }
}
