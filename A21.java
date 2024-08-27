

public class A21
{
  public static void checkSum(int[] arr, int target, int n)
  {
    boolean flag=false;
    for(int i=0;i<n-1;i++)
    {
      
      for (int j=i+1;j<n;j++)
      {
        if(arr[i]+ arr[j]==target)
        {
          flag=true;
          System.out.println("YES");

          System.out.println("["+ i + " , " + j +"]" );
          break;
          
        }
      

      }
        
    }
    if (flag==false) {
      System.out.println("NO");
      System.out.println("[-1 ,-1]");

      
    }
    
    
    

  }
  public static void main(String[] args) {
    int[] arr={2,6,5,8,11};
    int n=arr.length;
    int target=5;
    checkSum(arr, target, n);

  }
}

