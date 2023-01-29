class Solution {
    public boolean isIsomorphic(String s, String t) 
   {

    if(s.length() != t.length())
        return false;

    HashMap<Character, Character> letters = new HashMap<Character, Character>();

    for (int i = 0; i < s.length(); i++) 
    {
        char currentKey = s.charAt(i);
        char currentValue = t.charAt(i);


        if(!letters.containsKey(currentKey) && !letters.containsValue(currentValue))
        {
            letters.put(currentKey, currentValue);
        }
        else if (!letters.containsKey(currentKey) && letters.containsValue(currentValue))
            return false;
        else if(letters.containsKey(currentKey) && currentValue != letters.get(currentKey))
        {
            return false;
        }
    }
    return true;   
    }
        }
