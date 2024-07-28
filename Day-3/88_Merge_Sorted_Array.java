class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int last = m+n-1;
      
        // fill the nums1 backwards
        while(m>0 && n>0){
            if(nums1[m-1] > nums2[n-1])
                nums1[last] = nums1[--m];
            else
                nums1[last] = nums2[--n];
            last--;
        }
      
        // fill the remaining elements in nums2
        while(n>0)
            nums1[last--] = nums2[--n];
    }
}
