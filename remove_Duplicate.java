public class remove_Duplicate {
    public static void main(String[] args) {
        int a=removeDuplicates(new int[]{1,1,1,2,2,3,4,4});
        System.out.println(a);

    }
    public static int removeDuplicates(int[] nums) {
        int c=0;
        //int a[]=new int[nums.length];
        //int c=0;
        for(int i=0;i<nums.length-1;i++)
        {           
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j] )
                { 
                     System.out.println("\nDuplicate at:"+j);
                    c=c+1;               
                    nums[j]=nums[j+1];                                       
                }              
            }
            for(int k=0;k<nums.length;k++)
            System.out.print(" "+nums[k]+" ");
        }
        return(nums.length-c);
    }
}
