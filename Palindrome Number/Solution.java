class Solution {
    public boolean isPalindrome(int x) 
    {
        int reversedNr = 0;
        int currentVal = x;

        if (x < 0)
            return false;

        while(currentVal != 0)
        {
            int remaningValue = currentVal % 10;
            reversedNr = reversedNr * 10 + remaningValue;
            currentVal /= 10;
        }

    if (x == reversedNr)
    {
        return true;
    }
    else
        return false;
    }
}
