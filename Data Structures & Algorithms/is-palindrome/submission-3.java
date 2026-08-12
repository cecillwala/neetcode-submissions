class Solution {
    public boolean isPalindrome(String s) {
        int j = s.length() - 1;
        String t = s.toLowerCase();
        for(int i = 0; i < t.length(); i++){

            while(i < t.length() && !Character.isAlphabetic(t.charAt(i)) && !Character.isDigit(t.charAt(i))){
                i++;
            }

            while(j >= 0 && !Character.isAlphabetic(t.charAt(j)) && !Character.isDigit(t.charAt(j))){
                j--;
            }

            if(j >= 0 && i < t.length() && t.charAt(i) != t.charAt(j)){
                return false;
            }
            j--;
        }
        return true;
    }
}
