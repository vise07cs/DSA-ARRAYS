// find the 2nd largest

public class A1 {
    public static void  find2ndLargest(double arr[] ,int n)
    {   double max=arr[0];
        for(int i=0;i<n;i++)
        {
            
            if(arr[i]>max)
            {
                max=arr[i];
            }
            
        }
        System.out.println(" largest element is : " + max);
        double max2=arr[0];
        for(int j=0;j<n;j++)
        {
            if((arr[j]>max2)  && (arr[j] != max))
            {
                max2=arr[j];

            }
        }
        System.out.println("2nd largest element is : " + max2);
        

    }
    public static void main(String[] args) {
        double[] arr1={10,20,30,40,50};
        int n=arr1.length;
        find2ndLargest(arr1, n);

        double[] arr2={1,2,13,14,1};
        int n2=arr2.length;
        find2ndLargest(arr2, n2);

        double[] arr3={11,10.5,12.5,12.5};
        int n3=arr3.length;
        find2ndLargest(arr3, n3);


    }
    
    
}
