class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<dominoes.length;i++){
            int min = Math.min(dominoes[i][0], dominoes[i][1]);
            int max = Math.max(dominoes[i][0], dominoes[i][1]);
            int key =min*10+max;
            map.put(key,map.getOrDefault(key,0)+1);
            if(map.getOrDefault(key,0) >1){
                count +=map.getOrDefault(key,0)-1;
            }
        }
        return count;
    }
}