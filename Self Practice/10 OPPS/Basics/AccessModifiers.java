// Access Modifiers
/*
 * Private
 * Default
 * Protected
 * Public
 */

public class AccessModifiers {

    public static void main(String[] args) {
        Student s = new Student();

        s.setName("Ritesh");
        s.setRollNo(11);
        // s.rollNo = 12;

        System.out.println(s.getName());
        System.out.println(s.getRollNo());

    }
}

class Student {
    protected int rollNo;
    private String name;

    public void setRollNo(int rn) {
        if ((rn >= 100) && (rn <= 170)) {
            rollNo = rn;
        } else {
            System.out.println("Roll no is not within range");
        }
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}