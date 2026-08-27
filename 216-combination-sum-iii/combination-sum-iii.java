class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result=new ArrayList<>();
        back(1,k,n,new ArrayList<>(),result);
        return result;
    }
    private void back(int strt,int k, int target,List<Integer> current, List<List<Integer>> result){
        if(k==0 && target==0){
            result.add(new ArrayList<>(current));
            return;
        }
        if(k==0 || target<=0){
            return;
        }
        for(int i=strt;i<=9;i++){
            current.add(i);
            back(i+1,k-1,target-i,current,result);
            current.remove(current.size()-1);
        }
    }
}