import java.util.*;

public class PairSum2{

    public static boolean pairSum(ArrayList<Integer> list,int target){
        int breakPoint = -1;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                breakPoint = i;
                break;
            }
        }
        int start = breakPoint+1;;
        int end = breakPoint;



        while(start!=end){
            if(list.get(start)+list.get(end)==target){
                return true;
            }else if(list.get(start)+list.get(end)>target){
                end = (list.size()+end-1)%list.size();
            }else{
                start = (start+1)%list.size();
            }
        }

        return false;
    }


    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        int target = 100;
        // Sorted and rotated list
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        boolean ans = pairSum(list,target);
        System.out.println(ans);
    }
}