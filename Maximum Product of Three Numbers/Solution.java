class Solution {
    public int maximumProduct(int[] nums) {

        Arrays.sort(nums);

        int first = nums[0] * nums[1] * nums[nums.length-1];
        int second = nums[nums.length-1] * nums[nums.length-2] * nums[nums.length-3];
        int result = first > second ? first : second;
      
        return result;
    }
}
