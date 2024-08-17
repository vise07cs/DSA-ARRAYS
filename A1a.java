
public class A1a {
    public static void secondLargest(int[] arr, int n)
    {
        int max=arr[0];
        int max2= arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max2=max;
                max=arr[i];
            }
            else if(arr[i]<max && arr[i]>max2)
            {
                max2=arr[i];
            }
            
        }
        System.out.println(max2);

    }
    public static void main(String[] args) {
        int[] arr={5,4,3,12,11};
        int n=arr.length;
        secondLargest(arr, n);

        int[] arr2={-5,-4,-3,-12,-11};
        int n2=arr2.length;
        secondLargest(arr2, n2);
    }
    
    
}
