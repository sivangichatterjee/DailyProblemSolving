class Solution {
    public int findMin(int[] nums) {
       int low=0, high=nums.length-1,mid=0,min= Integer.MAX_VALUE;
        while(low<=high)
        {
            mid=(low+high)/2;
            if(nums[low]<=nums[mid])
            {
               if(nums[low]<min) 
               {
                    min=nums[low];
                }
                low=mid+1;
            }
            else {
                if(nums[mid]<min)
                {
                    min=nums[mid];
                }
                high=mid-1;
        }
        
        }
        return min; 
    }
}