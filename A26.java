public class A26 {
  public static int maxSum(int[] arr, int n)
  {
    int maxi=-100;
    int sum=0;
    for(int i=0;i<n;i++)
    {
      sum=sum+arr[i];
      if(sum>maxi)
      {
        maxi=sum;
      }
      if(sum<0)
      {
        sum=0;
      }

      
    }
    return maxi;
  }
  public static void main(String[] args) {
    int[] arr={-2, 1, -3,1,2 };
    int n=arr.length;
    int result=maxSum(arr, n);
    System.out.println(result);
   }
  
}
