import java.util.ArrayList;

public class OperationsOnLIst {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Add element
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // print element
        System.out.println(list);

        // get element
        // int elem0 = list.get(0);
        // int elem1 = list.get(1);
        // System.out.println(elem0 + " " + elem1);

        // remove element
        // list.remove(2);
        // System.out.println(list);

        // set element at index
        // list.set(2, 10);
        // System.out.println(list);

        // contains element
        // System.out.println(list.contains(2));
        // System.out.println(list.contains(11));

        // for adding element
        // list.add(1, 9);
        // System.out.println(list);

        // find size of arrayList
        System.out.println(list.size());

        // print arraylist using forloop
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
