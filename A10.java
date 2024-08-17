public class A10 {

    public static int linearSearch(int[] arr, int n, int t)
    {
        for(int i=0;i<n;i++)
        {
            if(arr[i]==t)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6};
        int n=arr.length;
        int t=5;
        int result=linearSearch(arr, n, t);
        System.out.println(result);

        int[] arr2={5,4,3,2,1};
        int n2=arr2.length;
        int t2=5;
        int result2=linearSearch(arr2, n2, t2);
        System.out.println(result2);

    } 
}