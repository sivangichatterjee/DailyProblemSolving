public class longestSubarray {
    public static void main(String[] args) {
        //this solution will not work with negative values
        //if negative values are a part of the array then use Hashing technique
        int arr[]={-1,-1,1}; int k= 0;
        int len=0,l=0, i=0, j=0, sum=0,c=0;
        while(i<arr.length)
        {
            sum+=arr[i];
           // System.out.println("After adding "+arr[i]+" sum:"+sum);
            if(sum<k)
            {
                i++;
            }
            else if(sum==k)
            {
                l=i-j+1;
                System.out.println(j+" "+(i));
                i++;
                c++;
            }
            else
            {
                sum=sum-arr[j]-arr[i];
                //j++;
              //  System.out.println("After subtracting "+arr[j]+" sum:"+sum);
                j++;
            }
        }
        System.out.println("no of subarrays:"+c);
    }
}
