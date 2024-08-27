public class A22 {
  public static int[] twoSum(int[] arr, int target, int n )
  {
    for(int i=0;i<n-1;i++)
    {
      for(int j=i+1;j<n;j++)
      {
        if(arr[i] + arr[j]==target)
        {
          return new int[]{i,j};
        }
      }
    }
    return new int[]{};
    
  }
  public static void main(String[] args) {
    int[] arr={5,6,7,8,9};
    int n=arr.length;
    int target=16;
    int[] result=new int[2];
    result=twoSum(arr, target, n);
    for(int i=0;i<result.length;i++)
    {
      System.out.print(result[i]);
    }
  }
  
}
