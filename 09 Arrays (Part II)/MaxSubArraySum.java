// Brute Force Approach
public class MaxSubArraySum {

    public static void maxSubArraySum(int arr[])
    {
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                int sum=0;
                for(int k=i;k<=j;k++)
                {
                    sum+=arr[k];
                }

                if(sum>maxSum){
                    maxSum = sum;
                }
            }
        }

        System.out.println(maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5,6};

        maxSubArraySum(numbers);
    }
}
