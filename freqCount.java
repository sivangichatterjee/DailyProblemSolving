import java.util.*;
public class freqCount{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements"); 
        for(int i=0;i<n;i++)
        {
             arr[i]=sc.nextInt();
        }
        System.out.println("Enter maximum value of array");
        int p=sc.nextInt();
        int hash[]=new int[p+1];
        for(int i=0;i<n;i++)
        {
            hash[arr[i]]+=1;
        }
        System.out.println("Frequency:");
        for(int i=1;i<p+1;i++)
        {
            System.out.println(i+"->"+hash[i]);
        }

    }
}