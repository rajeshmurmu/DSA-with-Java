
public class RemoveDuplicateString {

    public static void removeDuplicateString(String str, int i, StringBuilder newStr, boolean map[]) {

        if (i == str.length()) {
            System.out.println(newStr);
            return;
        }

        char currcntChar = str.charAt(i);

        if (map[currcntChar - 'a'] == true) {
            removeDuplicateString(str, i + 1, newStr, map);
        } else {
            map[currcntChar - 'a'] = true;
            removeDuplicateString(str, i + 1, newStr.append(currcntChar), map);
        }
    }

    public static void main(String[] args) {
        // String str = "appnnacollege";
        String str = "rajeshson";

        removeDuplicateString(str, 0, new StringBuilder(""), new boolean[26]);

    }
}