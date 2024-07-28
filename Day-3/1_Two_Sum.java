class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> dir = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            if(dir.containsKey(target - nums[i])) {
                return new int[] {dir.get(target-nums[i]),i};
            }
            else{
                dir.put(nums[i],i);
            }
        }
        return new int[]{};
    }
}
