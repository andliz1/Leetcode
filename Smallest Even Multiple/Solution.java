class Solution {
    public int smallestEvenMultiple(int n) 
    {
        if (n/2 * 2 == n)
            return n;
        else
            return n * 2;
    }
}
