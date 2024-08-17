public class A8 {
    public static void rotateArr(int[] arr, int low, int high)
    {
        while(low<high)
        {
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }

    }
    public static void rotateLeft(int[] arr,int n,int k)
    {
        rotateArr(arr, 0, k-1);

        rotateArr(arr, k, n-1);

        rotateArr(arr, 0, n-1);

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
            
        }
        System.out.println();



    }
    public static void main(String[] args) {
        int[] arr={3,7,8,9,10,11};
        int n=arr.length;
        int k=3;
        rotateLeft(arr,n,k);


        int[] arr2={1,2,3,4,5};
        int n2=arr2.length;
        int k2=2;
        rotateLeft(arr2,n2,k2);

        System.out.println("after rotation");

      
      

    }
    
}
