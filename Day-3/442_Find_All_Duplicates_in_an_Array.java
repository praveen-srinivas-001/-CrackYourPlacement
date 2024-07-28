class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> dups = new ArrayList<>();
        int[] count = new int[nums.length+1];
        for(int num: nums){
            if(count[num] != 0){
                dups.add(num);
            }
            else{
                count[num]++;
            }
        }
        return dups;
    }
}
