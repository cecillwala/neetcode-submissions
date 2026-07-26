class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++){
            int otherPair = target - nums[i];

            if(map.containsKey(otherPair) && map.get(otherPair) != i){
                return new int[]{i, map.get(otherPair)};
            }
        }

        return new int[]{};
    }
}
