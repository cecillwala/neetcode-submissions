class Solution {
    public boolean isValid(String s) {

        if(s.length() < 2){
            return false;
        }

        Deque<Character> stack = new ArrayDeque<>();

        HashMap<Character, Character> brackets = new HashMap<>();
        brackets.put(']','[');
        brackets.put('}', '{');
        brackets.put(')','(');

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            boolean isOpeningBracket = Character.compare(c, '[') == 0 || 
            Character.compare(c, '{') == 0 || Character.compare(c, '(') == 0;

            boolean isClosingBracket = Character.compare(c, ']') == 0 || 
            Character.compare(c, '}') == 0 || Character.compare(c, ')') == 0;

            if(isOpeningBracket){
                stack.push(c);
            }
            else if(isClosingBracket){
                boolean empty = stack.isEmpty();

                if(empty){
                    return false;
                }
                char top = stack.peek();

                if(Character.compare(top, brackets.get(c)) == 0){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
