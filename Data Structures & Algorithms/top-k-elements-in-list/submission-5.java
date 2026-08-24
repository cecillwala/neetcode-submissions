class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            else{
                map.put(nums[i], 1);
            }
        }

        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(entries);

        list.sort((a, b) -> b.getValue() - a.getValue());

        int[] result = new int[k];
        for(int i = 0; i < k; i++){
            result[i] = list.get(i).getKey();
        }

        return result;
    }
}
