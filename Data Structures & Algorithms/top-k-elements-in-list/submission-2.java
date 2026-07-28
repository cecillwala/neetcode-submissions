class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = toHashMap(nums);
        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(map.entrySet());
        entries.sort((a, b) -> b.getValue() - a.getValue());

        int[] result = new int[k];

        for(int i = 0; i < k; i++){
            result[i] = entries.get(i).getKey();
        }

        return result;

    }

    public HashMap<Integer, Integer> toHashMap(int[] nums){

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num: nums){
            if(map.containsKey(num)){
                map.put(num, map.get(num) + 1);
            }
            else{
                map.put(num, 1);
            }
        }

        return map;
    }
}
