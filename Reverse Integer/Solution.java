class Solution {
    public int reverse(int x) 
    {
        long reversed = 0;
        long remaining = Math.abs((long) x);

        while (remaining != 0)
        {
            reversed = reversed * 10 + remaining % 10;
            remaining /= 10;
        }

        if (reversed > Integer.MAX_VALUE)
        {
            return 0;
        }
        if (x > 0)
            return (int) reversed;
        else 
            return -1 * (int) reversed;

    }
}
