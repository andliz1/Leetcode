class Solution {
    public int[] distributeCandies(int candies, int num_people) 
    {
        int[] arr = new int[num_people];
        int n = 1;
        int i = 0;
        int sum = 0;
        while (sum < candies){

            if (candies - sum < n)
                arr[i] += (candies - sum);
            else
                arr[i] += n;
            
            sum += n;
            n++;
            i++;
           

            if (i == arr.length)
                i = 0;
        }
        return arr;
    }
}
