
public class Test {
    public static void main(String[] args) {
        Complex c = new Complex(1, 1);
        Complex d = new Complex(2, 2);

        Complex ans = Complex.add(c, d);
    }
}

class Complex {
    int real;
    int imag;

    Complex(int r, int i) {
        this.real = r;
        this.imag = i;
    }

    public static Complex add(Complex a, Complex b) {
        return new Complex(a.real + b.real, a.imag + b.real);
    }

    void add() {
        System.out.println(this.imag + this.real);
    }
}
