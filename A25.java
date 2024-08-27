public class A25 {
  public static int maxSum(int[] arr, int n)
  {
   int maxi=-100;
   for(int i=0;i<n;i++)
   {
    int sum=0;
     for(int j=i;j<n;j++)
     {
      
       sum=sum+arr[j];
       if(sum>maxi)
         {
           maxi=sum;
         } 
      
         // maxi=Math.max(maxi, sum);
                
       }
       
 
     }
     return maxi;
   }
 
  public static void main(String[] args) {
   int[] arr={1,-2,3,-1};
   int n=arr.length;
   int result=maxSum(arr, n);
   System.out.println(result);
  }
  
  
}
