class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int n = arr.length;
        int s1=0;
        int s2=0;
        int x=0;
        for(int i=0;i<arr.length;i++){
            x +=arr[i];
        }
        if(x%3 != 0) return false;
        int res = x/3;
        int i=0;
        for(i=0;i<n-2;i++){
            s1 += arr[i];
            if(s1==res) break;
        }
        int j=0;
        for(j=n-1;j>i-1;j--){
            s2 += arr[j];
            if(s2==res) break;
        }
        if(s1==s2 && s2==(x-s1-s2)) return true;
        return false;
    }
}