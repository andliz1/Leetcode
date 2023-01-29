class Solution {
    public boolean detectCapitalUse(String word) 
    {
        int upperCase = 0;
        int lowerCase = 0;

        int wordLength = word.length();

        boolean firstCharUpperCase = Character.isUpperCase(word.charAt(0));

            if(wordLength > 1)
            {
                for (int i = 1; i < wordLength; i++)
                {
                    if (Character.isUpperCase(word.charAt(i)))
                    upperCase++;
                    
                    else if(Character.isLowerCase(word.charAt(i)))
                    lowerCase++;
                }        
            }

            else if (word.length() == 1)
                return true;
            
            if (firstCharUpperCase && upperCase > 0 && lowerCase == 0)
                return true;
            else if (firstCharUpperCase && upperCase == 0 && lowerCase > 0)
                return true;
            else if (!firstCharUpperCase && upperCase == 0 && lowerCase > 0)
                return true;
            else 
                return false;
    }
}
