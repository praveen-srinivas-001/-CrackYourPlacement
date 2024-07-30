class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int goal = n-1;
        for(int src=n-2;src>=0;src--){
            if(nums[src]+src >= goal){
                goal = src;
            }
        }
        return (goal==0)? true: false;
    }
}
