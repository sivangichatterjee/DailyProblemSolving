class Solution {
    public int maxProduct(int[] nums) {
        int i=0, prefix=1, suffix=1, n=nums.length, max=Integer.MIN_VALUE;
        for(i=0;i<n;i++)
        {
            if(prefix==0)
            prefix=1;
            if(suffix==0)
            suffix=1;
            prefix=prefix*nums[i];
            suffix=suffix*nums[n-1-i];
            max=Math.max(max, Math.max(prefix, suffix));
        } 
        return max;
    }
}