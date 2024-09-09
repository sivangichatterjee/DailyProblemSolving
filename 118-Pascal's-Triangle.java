class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> listOfLists = new ArrayList<>();   
        //  int ans=1;
        //  list.add(ans);
        //  listOfLists.add(list);
        for(int i=1;i<=numRows;i++)
        {
             List<Integer> list=Row(i); // returns entire row for a particular row number
             listOfLists.add(list);           
        }
        return  listOfLists; 
    }
public List<Integer> Row(int row) {
         List<Integer> list = new ArrayList<>();
         int ans=1;
         list.add(1);//first column
        for(int col=1;col<row;col++) // indexing starts from 1 i.e. column 2 
        {
            ans=ans*(row-col);
            ans=ans/col;
            list.add(ans);
        }
        return list;
}
}