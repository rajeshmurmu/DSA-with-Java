public class StringCompression {
    public static String compress(String str) {

        StringBuilder compressStr = new StringBuilder("");

        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;

            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }

            compressStr.append(str.charAt(i));

            if (count > 1) {
                compressStr.append(count.toString());
            }

        }

        return compressStr.toString();
    }

    public static void main(String[] args) {
        String str = "aaabbcccdd";

        System.out.println(compress(str));

    }
}