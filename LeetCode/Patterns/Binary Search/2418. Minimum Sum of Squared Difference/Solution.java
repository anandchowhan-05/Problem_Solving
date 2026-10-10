class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n=nums1.length;
        int[] m=new int[n];
        long x=k1+k2;
        for(int i1=0;i1<n;i1++){
            m[i1]=Math.abs(nums1[i1]-nums2[i1]);
        }
        int ii=0;
        Arrays.sort(m);
      
        Arrays.sort(m);

        for (int i = 0; i < m.length / 2; i++) {
            int temp = m[i];
            m[i] = m[m.length - 1 - i];
            m[m.length - 1 - i] = temp;
        }

        while(x != 0){
            if(m[ii]==1) break;
            if(ii >= n) ii=0;
            if(m[ii]-1 > m[ii+1]){
                ii=0;
            }else{
                m[ii]=m[ii]-1;
                x--;
                ii++;
            }
        }
        long ans=0;
        for(int i3=0;i3<n;i3++){
            ans += (long)Math.pow(m[i3],2);
        }
        return ans;
    }
}