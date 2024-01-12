public class SubArrays {

    public static void subArrays(int arr[])
    {
        for(int i=0;i<=arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                for(int k=0;k<arr.length;k++)
                {
                    System.out.println("");
                }
            }
        }
    }

    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};

        subArrays(numbers);
    }
}
