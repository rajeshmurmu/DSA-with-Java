public class printAlphabet {

    public static void main(String[] args) {
        for(int i=65;i<65+26;i++)
        {
            // char c = (char)(i);
            System.out.print((char)(i)+" ");
        }

        System.out.println();
        for(int i=90;i>=65;i--)
        {
            System.out.print((char)(i)+" ");
        }
    }
}