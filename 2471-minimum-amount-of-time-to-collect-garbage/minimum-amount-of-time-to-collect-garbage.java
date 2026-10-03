class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
       int time=0;
       for(int i=1;i<travel.length;i++){
        travel[i]+=travel[i-1];
       } 
       int lastM=0;
       int lastP=0;
       int lastG=0;
       for(int i=0;i<garbage.length;i++){
        time+=garbage[i].length();
        if(garbage[i].contains("M")){
            lastM=i;
        }
        if(garbage[i].contains("P")){
            lastP=i;
        }
        if(garbage[i].contains("G")){
            lastG=i;
        }
       }
       if(lastM>0){
        time+=travel[lastM-1];
       }
       if(lastP>0){
        time+=travel[lastP-1];
       }
       if(lastG>0){
        time+=travel[lastG-1];
       }
       return time;
    }
}