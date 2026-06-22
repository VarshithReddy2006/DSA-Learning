class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int merge[] = new int[n+m];
        for(int i=0;i<m;i++){
            merge[i] = nums1[i];
        }
        for(int i=0;i<n;i++){
            merge[i+m] = nums2[i];
        }
        Arrays.sort(merge);
        int total = n+m;
        int mid = total/2;
        if(total%2 == 1){
            return merge[mid];
        }else{
            return (merge[mid-1]+merge[mid])/2.0;
        }
    }
}