import java.util.ArrayList;

public class PairSum1 {

    public static boolean pairSum(ArrayList<Integer> list, int target) {

        // for (int i = 0; i < list.size() - 1; i++) {
        // for (int j = i + 1; j < list.size(); j++) {
        // if (list.get(i) + list.get(j) == target) {
        // return true;
        // }
        // }
        // }

        // for sorted array
        int first = 0;
        int last = list.size() - 1;

        while (first < last) {
            if (list.get(first) + list.get(last) == target) {
                return true;
            } else if (list.get(first) + list.get(last) > target) {
                last--;
            } else {
                first++;
            }
        }

        return false;

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int target = 5;

        boolean ans = pairSum(list, target);

        System.out.println(ans);
    }
}
