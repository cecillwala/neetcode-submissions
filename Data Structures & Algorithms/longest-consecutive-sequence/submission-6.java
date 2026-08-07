class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        // Put all the numbers into a hashset
        HashSet<Integer> set = new HashSet<>();

        for(int num: nums){
            set.add(num);
        }

        // Convert set to array
        int[] arrSet = new int[set.size()];
        int i = 0;
        for (int val : set) {
            arrSet[i++] = val;
        }

        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int k = 0; k < arrSet.length; k++){

            int j = arrSet[k];

            if(set.contains(j - 1)){
                continue;
            }
            else{

                if(!map.containsKey(j)){
                    map.put(arrSet[k], 1);
                }

                while(set.contains(j + 1)){
                    j += 1;
                    map.put(arrSet[k], map.get(arrSet[k]) + 1);
                }
            }
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

        list.sort((a, b) -> b.getValue() - a.getValue());

        return list.get(0).getValue();
    }
}
