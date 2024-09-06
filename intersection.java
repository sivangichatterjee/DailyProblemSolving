import java.util.ArrayList;

public class intersection {
    public static void main(String[] args) {
           int n=5, m=8;
        int arr1[]={1,2,3,3,3};
        int arr2[]={2,3,3,4,5,7,7,10};
        ArrayList<Integer> intersection=new ArrayList<>();
        int i=0, j=0;
        while(i<n && j<m)
        {
            if(arr1[i]==arr2[j])
            {
                intersection.add(arr1[i]);
                i++;
                j++;
            }
            else if(arr1[i]<arr2[j])
            {
                i++;
            }
            else{
                j++;
            }
        }
        for( Integer item:intersection)
        {
            System.out.print(item +" ");
        }
    }
}
