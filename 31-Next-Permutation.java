class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length, ind=-1,tem=0;
        for(int i=n-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                ind=i;
                break;
            }
        }
        if(ind==-1)
        reverse(nums,0,n-1);
        else{
            for(int i=n-1;i>=0;i--)
            {
                    if(nums[i]>nums[ind])
                    {
                        tem=nums[i];
                        nums[i]=nums[ind];
                        nums[ind]=tem;
                        break;
                    }
            }
            reverse(nums,ind+1,n-1); 
        }    
    }
     public void reverse(int nums[], int start, int end)
       {
            while(start<end)
            {
                int tem=nums[start];
                nums[start]=nums[end];
                nums[end]=tem;
                start++;
                end--;
            }
       }
}