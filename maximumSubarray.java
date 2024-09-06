import java.util.ArrayList;

public class maximumSubarray {
    public static void main(String[] args) {
        int nums[]={-2,-3,4,-1,-2,1,5,-3};
        int i=0, j=0, sum=0, max=nums[0];
        int index_start=0, index_end=0;
        while(i<nums.length)
        {
            if(sum==0)
            {
                index_start=i;
            }
            sum+=nums[i];
           
            if(sum>max)
            {
                max=sum;
                index_end=i;
            }
            if(sum<0)
            {
            sum=0;
            // index_start=0;
            // index_end=0;

            }
            i++;
           
        }
        System.out.println("Maximum:"+max);
        for(i=index_start;i<=index_end;i++)
        System.out.print(nums[i]+" ");
    }
}
    //     while(i<nums.length)
    //     {
    //         sum+=nums[i];
    //         i++;
    //     }
    //     int left=0, right=nums.length-1,left1=0, right1=0, max=sum,k=1;
    //    while(left<=right)
    //     {
    //         if(nums[left]<nums[right] && sum-nums[left]>max)
    //         {
    //             System.out.println(sum+"-"+nums[left]+"="+(sum-nums[left]));
    //             sum=sum-nums[left];
    //             max=sum;
    //             //System.out.println();
    //             left++;
    //         }
    //         else if(nums[right]<nums[left] && sum-nums[right]>max)
    //         {
    //             System.out.println(sum+"-"+nums[right]+"="+(sum-nums[right]));
    //             sum=sum-nums[right];
    //             max=sum;
    //             right--;
    //         }
    //         else if(nums[right]==nums[left] && right!=0 && left!=nums.length-1)
    //         {
    //             left1=left+k;
    //             right1=right-k;
    //             if(nums[left1]>nums[right1])
    //             {
    //                 sum=sum-nums[right];
    //                 right=right-1;
    //             }
    //             else if(nums[right1]>nums[left1])
    //             {
    //                 sum=sum-nums[left];
    //                 left=left+1;
    //             }
    //             else
    //             {
    //                 k++;
    //             }
    //         }
    //         else
    //         {
    //             break;
    //         }
    //     }
