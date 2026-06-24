class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0 ;
        for ( String ans : operations)
        {
            if(ans.contains("++"))
            {
                x++ ;
            }
            else
            {
                x--;
            }
        }
        return x ;
           
        

    }
}