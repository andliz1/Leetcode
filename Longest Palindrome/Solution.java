class Solution {
    public int longestPalindrome(String s) 
    {
        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
        int result = 0;
        boolean singleChar = true;

        for (int i = 0; i < s.length(); i++) 
        {
            hashMap.put(s.charAt(i), hashMap.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int count : hashMap.values())
        {
            if(count % 2 == 0)
            {
                result += count;
            }
            else if (count % 2 != 0 && singleChar == true)
            {
                result += count;
                singleChar = false;
            }
            else
            {
                result += count - 1;
            }
                
        }
        return result;
}
}
