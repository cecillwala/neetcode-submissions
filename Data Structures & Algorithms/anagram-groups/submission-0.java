class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> list = new ArrayList<>();
        HashMap<HashMap<Character, Integer>, List<String>> map = new HashMap<>();

        for(int i =0; i < strs.length; i++){
            HashMap<Character, Integer> set = toHashMap(strs[i]);
            List<String> value = new ArrayList<>();

            if(map.containsKey(set)){
                value = map.get(set);
                value.add(strs[i]);
            }
            else{
                value.add(strs[i]);
                map.put(set, value);
            }   
        }

        return new ArrayList<>(map.values());
    }

    public HashMap<Character, Integer> toHashMap(String str){

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);

            if(map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            }
            else{
                map.put(c, 1);
            }
        }

        return map;
    }
}
