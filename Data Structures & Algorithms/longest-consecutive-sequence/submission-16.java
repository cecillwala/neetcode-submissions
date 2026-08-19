class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length < 1){
            return 0;
        }

        HashSet<Integer> set = new HashSet<>();

        int consecutive = 1;

        for(int num: nums){
            set.add(num);
        }

        for(int num: nums){

            if(!set.contains(num - 1)){
                int i = 1;
                int check = num;
                while(set.contains(check + 1)){
                    check++;
                    i++;
                    consecutive = Math.max(i, consecutive);
                }
            }
        }
        return consecutive;
    }
}