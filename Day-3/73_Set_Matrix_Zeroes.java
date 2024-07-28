class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        Set<Integer> zrow = new HashSet<Integer>();
        Set<Integer> zcol = new HashSet<Integer>();

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(matrix[i][j] == 0)
                {
                    zrow.add(i);
                    zcol.add(j);
                }
            }
        }

        //fill rows with zeroes
        for(int i=0;i<row;i++)
        {
            if(zrow.contains(i))
            {
                Arrays.fill(matrix[i],0);
            }
        }
        //fill cols with zeroes
        for(int i=0;i<col;i++)
        {
            if(zcol.contains(i))
            {
                for(int j=0;j<row;j++)
                {
                    matrix[j][i] = 0;
                }
            }
        }
    }
}
