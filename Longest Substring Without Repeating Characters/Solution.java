class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        HashSet<Character> chars = new HashSet<>();

        int counter = 0;
        int max = 1;

        if(s.length() == 1)
        {
            return 1;
        }
        else if(s.length() == 0)
        {
            return 0;
        }

        for (int i = 0; i < s.length(); i++) 
        {
            chars.add(s.charAt(i));
            counter++;

            for (int j = i+1; j < s.length(); j++) 
            {
                char currentChar = s.charAt(j);

                if(!chars.contains(currentChar))
                {
                    chars.add(currentChar);
                    counter++;
                    if (counter > max)
                        {
                            max = counter;
                        }
                }

                else
                    {
                        chars.clear();
                        counter = 0;
                        break;      
                    }
            
            }
        }
        return max;        
    }
}
