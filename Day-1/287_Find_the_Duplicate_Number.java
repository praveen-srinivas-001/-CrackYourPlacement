class Solution {
    public int findDuplicate(int[] nums) {
        int slow = 0; //slow pointer traverse one at a time.
        int fast = 0; //fast pointer traverse two at a time.
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow != fast);

        slow = 0;
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
