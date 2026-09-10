class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
         int n=nums1.length;
         int m=nums2.length;
    //    int low=Math.min(nums1[0],nums2[0]);
    //    int high=Math.min(nums1[n-1],nums2[m-1]);
    //    while(low<=high){
    //     int mid=(low+high)/2;
    //     int gt=Math.floor(nums1,n,mid)+Math.floor(nums2,m,mid);
    //     int lt=Math.ceil(nums1.n.mid)+m-Math.ceil(nums2,m,mid);
    //     if(gt==it) return mid;
    //     if(gt>lt) low=mid+1;
    //     else hi=mid+1;
    //    } 
    //     return -1;
        int[] arr=new int[n+m];
        int p1=0;
        int p2=0;
        int i=0;
        while(p1<n && p2<m){
            if(nums1[p1]<nums2[p2]){
                arr[i++]=nums1[p1];
                p1++;
            }else{
                arr[i++]=nums2[p2];
                p2++;
            }
        }
            while(p1<n){
                arr[i++]=nums1[p1];
                p1++;
            }
            while(p2<m){
                arr[i++]=nums2[p2];
                p2++;
            }
            int k = n + m;

        if(k % 2 == 0){
            return (arr[k/2] + arr[k/2 - 1]) / 2.0;
        }
        return arr[k/2];
    }
}