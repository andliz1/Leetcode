class Solution {
    public boolean wordPattern(String pattern, String s) 
    {
        String[] words = s.split(" ");

        String [] letters = new String [pattern.length()];

        for (int i = 0; i < letters.length; i++) 
        {
            letters[i] = String.valueOf(pattern.charAt(i));
        }

        if (words.length != letters.length)
            return false;

        for (int i = 0; i < letters.length; i++) 
        {
            String currentLetter = letters[i];

            String currentWord = words[i];

            for (int j = 0; j < letters.length; j++) 
            {
                if ((letters[j].equals(currentLetter) && !words[j].equals(currentWord)) || (words[j].equals(currentWord) && !letters[j].equals(currentLetter)))
                    return false;               
            }    
        }
        
        return true;      
    }
}
