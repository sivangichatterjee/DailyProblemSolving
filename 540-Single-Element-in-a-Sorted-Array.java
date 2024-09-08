class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length, ans=0, mid=0, low=1, high=n-2;
       if(n==1)
       ans=nums[0];
       else
       {
            if(nums[0]!=nums[1]) {ans=nums[0];}
            if(nums[n-1]!=nums[n-2]) {ans=nums[n-1];}       
            while(low<=high)
            {
                mid=(low+high)/2;
                if(nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1])
                {
                    ans=nums[mid];
                    break;
                }
                if((mid%2!=0 && nums[mid]==nums[mid-1])|| (mid%2==0 && nums[mid]==nums[mid+1]))
                {
                    low=mid+1;
                }
                else if((mid%2==0 && nums[mid]!=nums[mid+1]) || (mid%2!=0 && nums[mid]!=nums[mid-1]))
                {
                    high=mid-1;
                }                   
            }
       }
        return ans;
    }
}