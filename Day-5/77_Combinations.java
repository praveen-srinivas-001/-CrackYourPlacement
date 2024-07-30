class Solution {
    public List<Integer> backtrack(int n, int k, int start, List<Integer> comb, List<List<Integer>> result){
        if(comb.size() == k){
            result.add(new ArrayList(comb));
            return null;
        }
        for(int i=start;i<=n;i++){
            comb.add(i);
            backtrack(n,k,i+1,comb,result);
            comb.remove(comb.size()-1);
        }
        return null;
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> combination = new ArrayList<>();

        backtrack(n,k,1,combination,result);
        return result;
    }
}
