import java.util.Arrays;

public class TwoSumOptimized {
    public static void main(String[] args)
    {
        int arr[]={3,2,4};
        int k=6;
        Arrays.sort(arr);
        int  l=arr.length; 
        int left=0;
        int right=l-1;
        while(left<right)
        {             
            int sum=arr[left]+arr[right];
            if(sum==k)
            {System.out.println(left+" "+ right); break;}
            if(sum>k)
            {
                right=right-1;
                System.out.println("Right"+right);
            }
            if(sum<k)
            {
                left=left+1;
                System.out.println("Left"+left);
            }           
        }
    }
}
