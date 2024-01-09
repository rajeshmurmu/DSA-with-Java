public class callByValue {
    // In java all functions use call by value;
    public static void swap(int a, int b)
    {
        int temp = 5;
        a = b;
        b = temp;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        swap(a, b);
        System.out.println(a + " "+ b);
    }
}
