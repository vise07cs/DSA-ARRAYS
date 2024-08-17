
public class A6 {
    public static void rotateArray(int[] arr, int n)
    {
        int low=0;
        int high=n-1;
        while(low<high)
        {
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }

    }
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,7};
        int n=arr.length;
        rotateArray(arr, n);
        System.out.println();

        int[] arr2={2,3,4,5,6,7,9};
        int n2=arr2.length;
        rotateArray(arr2, n2);
    
}
}
