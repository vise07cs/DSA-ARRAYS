public class A15 {
    public static int missingNum(int[] arr , int m)
    {
        int flag=0;
        for(int i=1;i<=m;i++)
        
        {
           
            for(int j=0;j<m-1;j++)
            {
                if(arr[j]==i)
                {
                    flag=1;
                    break;

                }
                else
                {
                    flag=0;
                    
                }
            }

            if(flag==0)
            {
                return i;
            }  
        
    }
    return -1;
        
    }
    public static void main(String[] args) {
        int[] arr={1,2,4,5};
        int m=5;
        int result=missingNum(arr, m);
        System.out.println(result);

        
    }

    
}
