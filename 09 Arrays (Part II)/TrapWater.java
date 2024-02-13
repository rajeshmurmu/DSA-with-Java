public class TrapWater {

    public static void TrappedWater(int arr[]) {

        // for left max
        int leftmax[] = new int[arr.length];
        leftmax[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            leftmax[i] = Math.max(arr[i], leftmax[i - 1]);
        }

        // for right max
        int rightmax[] = new int[arr.length];
        rightmax[arr.length - 1] = arr[arr.length - 1];

        for (int i = arr.length - 2; i >= 0; i--) {
            rightmax[i] = Math.max(arr[i], rightmax[i + 1]);
        }

        // find trappedWater;
        int trappedWater = 0;
        for (int i = 0; i < arr.length; i++) {
            int water = Math.min(leftmax[i], rightmax[i]);
            trappedWater += water - arr[i];
        }

        System.out.println(trappedWater);
    }

    public static void main(String[] args) {
        int trap[] = { 4, 2, 0, 6, 3, 2, 5 };

        TrappedWater(trap);
    }
}
