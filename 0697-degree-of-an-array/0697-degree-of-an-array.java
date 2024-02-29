class Solution {
    public int findShortestSubArray(int[] nums) {
        // Create a map to keep track of the frequency and first/last occurrence of each element
        Map<Integer, int[]> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(!map.containsKey(nums[i])) {
                map.put(nums[i], new int[]{1, i, i});
            } else {
                int[] temp = map.get(nums[i]);
                temp[0]++;
                temp[2] = i;
            }
        }
        
        // Find the degree of the input array
        int degree = 0;
        for(int[] value : map.values()) {
            degree = Math.max(degree, value[0]);
        }
        
        // Find the smallest possible length of a contiguous subarray with the same degree
        int minLen = Integer.MAX_VALUE;
        for(int[] value : map.values()) {
            if(value[0] == degree) {
                minLen = Math.min(minLen, value[2] - value[1] + 1);
            }
        }
        
        return minLen;
    }
}
