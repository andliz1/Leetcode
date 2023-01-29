class Solution {
    public boolean isValidSudoku(char[][] board) 
    {
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < 9; i++)
        {
            for(int j = 0; j < 9; j++)
            {
                char current = board[i][j];

                if(current != '.')
                {
                    if(!set.add("row" + i + current) || (!set.add("column" + j + current)))
                        return false;
                    else if (!set.add("box"+ (i/3)*3 + j/3 + current))
                        return false;
                }
            }
        }
        return true;
    }
}
