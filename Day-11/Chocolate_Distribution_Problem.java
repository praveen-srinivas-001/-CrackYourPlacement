class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        Collections.sort(a);
        
        int i=0,j=0,count=0;
        long min_count=Integer.MAX_VALUE;
        
        while(j<a.size()){
            if(j-i>=m-1){
                count=a.get(j)-a.get(i);
                min_count=Math.min(min_count,count);
                count=0;
                i++;
            }
            j++;
        }
        return min_count;
    }
}
