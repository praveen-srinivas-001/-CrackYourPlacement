class Solution {
    private void swap(int i, int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void sortColors(int[] nums) {
        int i = 0, l = 0, r = nums.length - 1;
        while (l <= r){
            if (nums[l] == 0)
                swap(i++, l++, nums);
            else if (nums[l] == 1)
                l++;
            else
                swap(l, r--, nums);
        }
    }
}