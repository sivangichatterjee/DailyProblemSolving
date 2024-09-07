public class removeElement {
    public static void main(String[] args) {
        
        int nums[]={3,2,2,3};
        int val=3;
        int i=0,c=0;
        while(i<nums.length-1)
        {
            System.out.print("\n Iteration "+i);
            
            if(nums[i]==val)
            {
                c++;
                if(i==nums.length-c)
                break;
                System.out.print("\nmatch found "+nums[i]+" at "+i);
                for(int j=i;j< nums.length-1;j++)
                {
                    nums[j]=nums[j+1];   
                                                   
                }              
                System.out.print("\nAfter left shift");
                for(int k=0;k<nums.length;k++)
                System.out.print("\n"+nums[k]+" ");
            }          
            else
            i++;
            //for(int k=0;k<nums.length;k++)
        }
        
        if(nums[i]==val && i==nums.length-1)
        {
            c++;
        } 
        System.out.println("c:"+c);
        System.out.print("\nFinal");
        for(int k=0;k<nums.length-c;k++)
        System.out.print("\n"+nums[k] + " ");
    }    
}
