class Solution {
    public String largestOddNumber(String num) {
        int x=0; String str="";
        //int max=Integer.MIN_VALUE;
        // int x=Character.getNumericValue(num.charAt(num.length()-1));
        // if(x%2!=0)
        // return num;
        // for(int i=0;i<num.length();i++)
        // {
        //     a=Character.getNumericValue(num.charAt(i));
        //     if(a%2!=0)
        //     {
        //         str=str+a;
        //         flag=1;
        //     }
        // }
        // if(flag==0)
        // return "";
        // else
        // return str;
         //int copy = Integer.parseInt(num);
        for(int i=num.length()-1; i>=0;i--)
        {
            x=Character.getNumericValue(num.charAt(i));
            if(x%2!=0)
            {
                str=num.substring(0,i+1);
                break;
            }        
        }
        return str;
    }
}