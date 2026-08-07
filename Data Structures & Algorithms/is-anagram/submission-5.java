class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> maps = new HashMap<>();
        HashMap<Character, Integer> mapt = new HashMap<>();

        for(int i  = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(maps.containsKey(c)){
                maps.put(c, maps.get(c) + 1);
            }
            else{
                maps.put(c, 1);
            }
        }

        for(int i  = 0; i < t.length(); i++){
            char c = t.charAt(i);
            if(mapt.containsKey(c)){
                mapt.put(c, mapt.get(c) + 1);
            }
            else{
                mapt.put(c, 1);
            }
        }

        return mapt.equals(maps);
    }
}
