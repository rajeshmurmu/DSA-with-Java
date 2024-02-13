public class LinearSearch {

    public static int linearSearch(int arr[],int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target) return i;
        }

        return -1;
    }

    public static boolean searchInMenu(String arr[],String target)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target) return true;
        }

        return false;
    }

    public static void main(String[] args) {
        // Problem I
        // int numbers[] = {2,4,6,8,10,12,14,16};
        // int key = 20;
        // int index = linearSearch(numbers,key);
        // if(index!=-1)
        // {
        //     System.out.println("key is at index : "+index);
        // }
        // else
        // {
        //     System.out.println("Not found");
        // }

        // Problem II
        String menu[] = {"dosa","chole bhature","samosa"};
        if(searchInMenu(menu,"idli"))
        {
            System.out.println("Found");
        }
        else
        {
            System.out.println("Not Found");
        }
    }
}
