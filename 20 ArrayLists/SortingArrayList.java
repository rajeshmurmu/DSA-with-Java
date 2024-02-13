import java.util.*;

public class SortingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(10);
        list.add(4);
        list.add(5);

        System.out.println(list);
        // sorting in accending order
        Collections.sort(list);
        System.out.println(list);

        // sorting in descending order
        Collections.sort(list, Collections.reverseOrder());
        // Collections.reverseOrder is a comparator that defines the fuctions logic
        System.out.println(list);
    }
}
