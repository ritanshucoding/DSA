class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int x: asteroids) arr.add(x);
        int i =0;
        while(i<arr.size()-1){
            int a = arr.get(i);
            int b = arr.get(i+1);
            if(a>0 && b<0){
                if(Math.abs(a)>Math.abs(b)){
                    arr.remove(i+1);
                }else if(Math.abs(a)<Math.abs(b)){
                    arr.remove(i);
                    if(i>0) i--;
                }else{
                    arr.remove(i+1);
                    arr.remove(i);
                    if(i>0) i--;
                }
            }else{
                i++;
            }
        }
    int[] ans = new int[arr.size()];
    for(int j=0;j<arr.size();j++){
        ans[j]=arr.get(j);
    }
    return ans;
}
}