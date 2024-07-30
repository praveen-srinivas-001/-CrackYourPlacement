class Solution {
    public int climbStairs(int n) {
        if(n<=3) return n;
        int[] dp = {1,2,3};
        for(int i=3;i<n;i++){
            dp[0] = dp[1];
            dp[1] = dp[2];
            dp[2] = dp[0]+dp[1];
        }
        return dp[2];
    }
}
