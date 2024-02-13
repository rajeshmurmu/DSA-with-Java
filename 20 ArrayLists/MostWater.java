import java.util.ArrayList;

public class MostWater {

    public static void containerWithMostWater(ArrayList<Integer> list) {

        int maxWater = Integer.MIN_VALUE;

        // brute force
        // for (int i = 0; i < list.size() - 1; i++) {
        // for (int j = i + 1; j < list.size(); j++) {
        // int minHeight = Integer.min(list.get(i), list.get(j));
        // int width = j - i;
        // int water = minHeight * width;

        // maxWater = Integer.max(maxWater, water);
        // }
        // }
        // System.out.println(maxWater);

        // Using two(2) Pointer approach

        int left = 0;
        int right = list.size() - 1;

        while (left < right) {

            int width = right - left;
            int height = Math.min(list.get(left), list.get(right));
            int water = width * height;

            maxWater = Math.max(maxWater, water);

            if (right > left) {
                left++;
            }

            if (right < left) {
                right--;
            }
        }

        System.out.println(maxWater);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);

        System.out.println(list);
        containerWithMostWater(list);
    }
}