// import java.util.*;
public class A24 {
 public static int maxSum(int[] arr, int n)
 {
  int maxi=-100;
  for(int i=0;i<n;i++)
  {
    for(int j=i;j<n;j++)
    {
      int sum=0;
      for(int k=i;k<=j;k++)
      {
        sum=sum+ arr[k];
          
        }
        // maxi=Math.max(maxi, sum);
        if(sum>maxi)
        {
          maxi=sum;
        }        
      }

    }
    return maxi;
  }

 public static void main(String[] args) {
  int[] arr={-2, 1, -3, 4, -1,2,1,-5,4};
  int n=arr.length;
  int result=maxSum(arr, n);
  System.out.println(result);
 }
 
 
}
