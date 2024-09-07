import java.util.*;
public class arrayspiral{
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int m= matrix.length;
        int n= matrix[0].length;
        int top=0, bottom=m-1, left=0, right=n-1;
        while(top<= bottom)
        {
            for(int i=left;i<=right;i++)
            {
                arr.add(matrix[top][i]);
                
            }
            top++;
           // System.out.println(arr);
            for(int i=top;i<=bottom;i++)
            {
                arr.add(matrix[i][right]);
                
            }
            right--;
           // System.out.println(arr);
            if(top<=bottom)
            {
                for(int i=right;i>=left;i--)
                {
                    arr.add(matrix[bottom][i]);
                    
                }
                bottom--;
            }
           
           // System.out.println(arr);
            if(left<=right)
            {
                for(int i=bottom;i>=top;i--)
                {
                    arr.add(matrix[i][left]);
                    
                }
                left++;
            }
            //System.out.println(arr);
        }
        System.out.println(arr);
    }
}