class Solution {
    public int[] runningSum(int[] nums) {

        int[] newNums = new int[nums.length];

        int addUpp = 0;

        for(int i = 0; i< nums.length; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                addUpp += nums[j];
            }
            newNums[i] = addUpp;
            addUpp = 0;
        }
        return newNums;
    }
}
