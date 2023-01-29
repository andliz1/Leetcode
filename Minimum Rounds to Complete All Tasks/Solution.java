class Solution {
    public int minimumRounds(int[] tasks) 
    {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        int result = 0;

        for (int i : tasks)
        {
            hashMap.put(i, hashMap.getOrDefault(i, 0) + 1);
        }

        for (int count : hashMap.values())
        {
            if (count < 2)
                return -1;
            else
                {
                    result += count / 3;

                    if(count % 3 != 0)
                        result ++;
                }
        }
        return result;

    }

}
