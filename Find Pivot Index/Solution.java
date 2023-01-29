class Solution {
    public int pivotIndex(int[] nums)
    {
        int leftSum;
        int rightSum;
        int searchedIndex = 0;
        
        while (searchedIndex < nums.length)
        {
            leftSum = 0;
            rightSum = 0;
    
            for (int i = 0; i < searchedIndex; i++) 
            {
                leftSum += nums[i];
            }
    
            for (int j = searchedIndex+1 ; j < nums.length; j++) 
            {
                rightSum += nums[j];
            }
    
            if (searchedIndex == 0 && leftSum == rightSum)
                return 0;
    
            else if (leftSum == rightSum)
            {
                return searchedIndex;
            }
    
            searchedIndex += 1;
        }
        return -1;  
    } 
}
