class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int step=requests[0];
        for(int i=1;i<requests.length;i++){
            step += Math.abs(requests[i-1]-requests[i]);
        }
        return step;
    }
}