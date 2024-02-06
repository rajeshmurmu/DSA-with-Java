import java.lang.StringBuilder;

public class ReverseWordsInString {

    public static String reverseWordsInString(String s) {
        String arr[] = s.split(" ");
        System.out.println(arr[1]);
        StringBuilder str = new StringBuilder();
        // System.out.println(arr[0]);

        for (int i = 0; i < arr.length; i++) {
            String currentWord = arr[i];
            str.append(reverseWords(currentWord));
            if (str.length() < s.length()) {
                str.append(" ");
            }
        }

        return str.toString();

    }

    public static StringBuilder reverseWords(String word) {
        StringBuilder str = new StringBuilder();

        for (int i = word.length() - 1; i >= 0; i--) {
            str.append(word.charAt(i));
        }

        return str;
    }

    public static void main(String[] args) {
        String s = "I am a good boy";
        String res = reverseWordsInString(s);
        System.out.println(res);
    }
}
