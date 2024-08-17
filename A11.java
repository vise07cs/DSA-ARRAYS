// import java.lang.Math;
public class A11 {
    public static int countOnes(int[] arr, int n)
    {
        int count=0;
        int maxCount=0;
        for(int i=0;i<n;i++)
        {
           
        if(arr[i]==1  )
        {
            count=count +1;
            if(count>maxCount)
            {
                maxCount=count;
            }     
        }
        
        else
        {
            count=0;
        }
        // maxCount=Math.max(maxCount,count);
        
            
        }
        return maxCount;
      
    }
    public static void main(String[] args) {
        int[] arr={1,1,0,1,0,1,1,1};
        int n=arr.length;
        int result=countOnes(arr, n);
        System.out.println(result);

    }
    
}
