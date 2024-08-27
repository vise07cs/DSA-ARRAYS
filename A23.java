import java.util.*;
public class A23 {
  public static void twoSum(int[] arr, int target, int n)
  {
    int[] tempArr=new int[n];
    for(int i=0;i<n;i++)
    {
      tempArr[i]=arr[i];
      // System.out.println(tempArr[i]);
    }
    Arrays.sort(arr);
    int low=0;
    int high=n-1;
    boolean flag=false;

    while(low<high)
    {
      
      
      int sum=0;
      sum=sum+arr[low] +arr[high];
      if (sum==target) {
        flag=true;
        System.out.println("YES");
        // System.out.print(low +" " + high);
        // int value1=arr[low];
        // int value2=arr[high];
        // System.out.println();
        // System.out.println(value1 + " " +value2);
        break;
        
      }
      else if (sum>target) {
        high--;
        
      }
      else
      {
        low++;
      }

    }
    if (flag==true) {
      for(int k=0;k<n;k++)
      {
        if(tempArr[k]==arr[low] || tempArr[k]==arr[high])
        System.out.print(k+ " ");
      }
      
      
    }
    

  }
  public static void main(String[] args) {
    int[] arr={4,2,1,6,7};
    int n=arr.length;
    int target=6;
    twoSum(arr, target, n);
  }
  
}
