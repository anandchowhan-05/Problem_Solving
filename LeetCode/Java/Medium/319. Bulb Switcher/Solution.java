class Solution {
    public int bulbSwitch(int n) {
        if(n==0 || n==1) return n;
        int[] arr=new int[n];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j%i==0){
                    if(arr[j-1]==0){
                        arr[j-1]=1;
                    }else{
                        arr[j-1]=0;
                    }
                }
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==n) count++;
        }
        return count;
    }
}