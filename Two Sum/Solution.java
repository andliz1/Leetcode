class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        int currentNumber;
        int addNumber;

        for (int i = 0; i < nums.length; i++)
        {
            currentNumber = nums[i];
            
            for (int j = (i + 1); j< nums.length; j++)
            {
                addNumber = nums[j];
                
                if((currentNumber + addNumber) == target)
                {
                    int[] arr = {i,j};
                    return arr;
                }
            }
        }

        return null;
    }
}
