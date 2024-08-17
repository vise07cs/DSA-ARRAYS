import java.util.*;
public class A14 {
    public static void removeDuplicates(int[] arr, int n)
    {
        HashSet <Integer> set =new HashSet<>();
        for(int i=0;i<n;i++)
        {
            set.add(arr[i]);
        }
        System.out.println(set);
        int k=set.size();
        System.out.println(k);






    }
    public static void main(String[] args) {
        int[] arr={8,8,1,1,2,3,3,3,4,4,5,5,6};
        int n=arr.length;
        removeDuplicates(arr, n);
    }

       
    
}
