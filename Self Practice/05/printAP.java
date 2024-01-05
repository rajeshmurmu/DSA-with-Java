
public class printAP {
    
    public static void main(String[] args) {
        int var=7;
        int ans=220;
        
        while(ans<730)
        {
            ans+=var;
            if(ans<730)
            {
                System.out.println(ans);
            }
        }
    }
}
