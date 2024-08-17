// import java.util.*;
import java.util.ArrayList;
public class A12 {
    public static int[]  moveZeros(int[] arr, int n)
    {
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(arr[i] !=0 )
            {
                temp.add(arr[i]);

            }

        }
        int tempSize=temp.size();
        
        for(int i=0;i<tempSize;i++)
        {
            arr[i]=temp.get(i);
            
        }
        for(int i=tempSize;i<n;i++)
        {
            arr[i]=0;
        }
        return arr;
          
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,0,0,0,8,7};
        int n=arr.length;
        int[] result=moveZeros(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }    
}
