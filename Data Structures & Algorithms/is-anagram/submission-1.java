class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> map_s = new HashMap<>();
        HashMap<Character, Integer> map_t = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(map_s.containsKey(c)){
                map_s.put(c, map_s.get(c) + 1);
            }
            else{
                map_s.put(c, 1);
            }
        }

        for(int i = 0; i < t.length(); i++){
            char c = t.charAt(i);
            if(map_t.containsKey(c)){
                map_t.put(c, map_t.get(c) + 1);
            }
            else{
                map_t.put(c, 1);
            }
        }
        
        return map_s.equals(map_t);
    }
}
