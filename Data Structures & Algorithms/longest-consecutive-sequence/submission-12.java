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

        int longest = 0;

        for(int num: set){

            int j = num;
            int i = 1;

            if(!set.contains(j - 1)){
                while(set.contains(j + 1)){
                    i += 1;
                    j += 1;
                }
            }

            if(i > longest){
                longest = i;
            }
        }

        return longest;
    }
}
