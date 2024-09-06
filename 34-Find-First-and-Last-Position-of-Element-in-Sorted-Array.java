class Solution {
    public int[] searchRange(int[] nums, int target) {
        int op[]=new int[2]; int start=-1, end=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target && start==-1)
            {
                start=i;
            }
            if(nums[i]==target && start!=-1)
            {
                end=i;
            }
        } 
        op[0]=start;op[1]=end;
        return op;
    }
}