class Solution {
    public boolean search(int[] nums, int target) {
         int low=0, high=nums.length-1, mid=0;
        while(low<=high)
        {
            mid=(low+high)/2;
            if(nums[mid]==target) return true;
            if(nums[low]==nums[mid] && nums[mid]==nums[high])
            {
                low=low+1;
                high=high-1;
                continue;
            }
            else if(nums[low]<=nums[mid])
            {
                if(target>=nums[low] && target<=nums[mid])
                    high=mid-1;
                else
                    low=mid+1;                
            }
            else 
            {
                if(target>=nums[mid] && target<=nums[high])
                low=mid+1;
                else
                high=mid-1;
            }
        }
        return false;
    }
}