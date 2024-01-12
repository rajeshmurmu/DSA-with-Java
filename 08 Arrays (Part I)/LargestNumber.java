public class LargestNumber {

    public static int findLargest(int arr[])
    {

        // -Infinity = Integer.MIN_VALUE;
        // Infinity = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                largest=arr[i];
            }
        }

        return largest;
    }

    public static int findSmallest(int arr[])
    {
        int smalllest= Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<smalllest)
            {
                smalllest = arr[i];
            }
        }

        return smalllest;
    }

    public static void main(String[] args) {
        int numbers[] = {1,2,6,3,5};
        System.out.println("Largest is : "+findLargest(numbers));
        System.out.println("Smallest is : "+findSmallest(numbers));
    }
}
