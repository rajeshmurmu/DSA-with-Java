
public class ThisKeyword {
    public static void main(String[] args) {
        Demo d = new Demo(20);
        Demo d1 = new Demo(33);
        Demo maxD;
        maxD = d.greater(d1);
        maxD.print();

    }
}

class Demo {
    int i;

    Demo(int i) {
        this.i = i;
    }

    Demo greater(Demo d) {
        if (d.i > this.i) {
            return d;
        } else {
            return this;
        }
    }

    void print() {
        System.out.println(this.i);
    }
}