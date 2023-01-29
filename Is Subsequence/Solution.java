class Solution {
    public boolean isSubsequence(String s, String t) 
    {

        int lastPosition = 0;
        int correctNumbers = 0;

        for (int i = 0; i< s.length(); i++)
        {
            char currentChar = s.charAt(i);

            for (int j = lastPosition; j < t.length(); j++) 
            {
                char tCurrentChar = t.charAt(j);

                if(currentChar == tCurrentChar)
                {
                    lastPosition = j+1;
                    correctNumbers ++;
                    break;
                }
                else if(currentChar != tCurrentChar && j == t.length() - 1)
                    return false;
            }
            

        }
        
        if (correctNumbers == s.length())
            return true;
        else 
            return false;
    }
}
