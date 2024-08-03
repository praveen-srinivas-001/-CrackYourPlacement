class Solution {
    public boolean validPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        
        while(l <= r){
            if(s.charAt(l) == s.charAt(r)){
                l++;
                r--;
            }
            else return isPalindrome(s, l + 1, r) || isPalindrome(s, l, r - 1);
        }
        return true;
    }
    public boolean isPalindrome(String s, int i, int j){
        while(i <= j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else return false;
        }
        return true;
    }
}
