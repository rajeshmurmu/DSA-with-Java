import java.util.ArrayList;

public class PascalTriangle {

    public static void generatePascal(int numRows) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        mainList.add(list);
        mainList.get(0).add(1);

        for (int i = 1; i < numRows; i++) {
            mainList.add(new ArrayList<>());
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    mainList.get(i).add(1);
                } else {
                    int p = mainList.get(i - 1).get(j - 1);
                    int q = mainList.get(i - 1).get(j);
                    mainList.get(i).add(p + q);
                }
            }

        }

        // System.out.println(mainList);
        // printing
        for (int i = 0; i < mainList.size(); i++) {
            for (int j = 0; j < mainList.get(i).size(); j++) {
                int e = mainList.get(i).get(j);
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int row = 5;

        generatePascal(row);
    }
}
