public class A9 {
    public static void reverseArray(int[] arr, int low, int high)
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

    public static void rotateRight(int[] arr, int k, int n)
    {
        reverseArray(arr, 0, n-k-1);

        reverseArray(arr, n-k, n-1);

        reverseArray(arr, 0, n-1);

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int k=2;
        int n=arr.length;

        int[] arr2={3,7,8,9,10,11};
        int k2=3;
        int n2=arr.length;

        rotateRight(arr, k, n);
        System.out.println();

        rotateRight(arr2, k2, n2);
    }

    
}
