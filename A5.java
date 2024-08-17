

public class A5 {
    public static void checkSorted(int[] arr, int n)
    {
        boolean isSorted=true;
        for(int i=1;i<n;i++)
        {
            if(arr[i-1]<arr[i])
            {
                isSorted=true;

            }
            else
            {
                isSorted=false;
            }
        }
        if(isSorted==false)
        {
            System.out.println(" not sorted");
        }
        else
        {
            System.out.println("Sorted");
        }
    }
    public static void main(String[] args) {
        int[] arr={5,4,3,12,11};
        int n=arr.length;
        checkSorted(arr, n);


        int[] arr2={1,2,3,4,5};
        int n2=arr2.length;
        checkSorted(arr2, n2);

        int[] arr3={20,30,40,50,60};
        int n3=arr3.length;
        checkSorted(arr3, n3);
    }
    
}
