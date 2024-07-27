class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        for(int l=0; l<n; l++){
            //find the zero.
            if(nums[l] != 0) continue;
            
            //find the non-zero element
            int r = l+1;
            while(r<n && nums[r] == 0){
                r++;
            }
            if(r == n) break;
            //Swap the left and right.
            nums[l] = nums[l] + nums[r];
            nums[r] = nums[l]-nums[r];
            nums[l] = nums[l]-nums[r];
        }
    }
}