class Solution {
    public int[] sortedSquares(int[] nums) 
    {
        int[] squaredNums = new int[nums.length];

        for (int i = 0; i < nums.length; i++)
        {
            squaredNums[i] = (nums[i]) * (nums[i]);
        }

        Arrays.sort(squaredNums);

        return squaredNums;
    }
}
