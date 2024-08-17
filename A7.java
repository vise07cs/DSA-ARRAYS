
public class A7 {
    public static void leftRotate(int[] arr,int k,int n)
    {
        // rotate k elements
        int high=k-1;
        int low=0;
        while(low<high)
        {
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
        // for(int i=0;i<n;i++)
        // {
        //     System.out.print(arr[i] + " ");
            

        // }
        // System.out.println();

        int low2=k;
        int high2=n-1;
        while(low2<high2)
        {
            int temp=arr[low2];
            arr[low2]=arr[high2];
            arr[high2]=temp;
            low2++;
            high2--;
        }
        // for(int j=0;j<n;j++)
        // {
        //     System.out.print(  arr[j] + " ");
            
        // }
        // System.out.println();

        int start=0;
        int end=n-1;
        while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    
        for(int m=0;m<n;m++)
        {
            System.out.print(arr[m]+ " ");
           
        }
        System.out.println();

   
    }
    public static void main(String[] args) {
        int[] arr={3,7,8,9,10};
        int k=3;
        int n=arr.length;
        leftRotate(arr, k, n);


        

        System.out.println();

        

       
    }


    
}

