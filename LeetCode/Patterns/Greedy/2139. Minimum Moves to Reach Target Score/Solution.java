class Solution {
    public int minMoves(int target, int maxDoubles) {
        int count=0;
        if(maxDoubles == 0) return target-1;
        if
        while(target != 0){
            if(target%2==0 && maxDoubles > 0){
                target=target/2;
                count++;
                maxDoubles--;
            }else{
                target=target-1;
                count++;
            }
        }
        int x=target-1;
        return count+x;
    }
}