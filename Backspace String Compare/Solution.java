class Solution {
        public boolean backspaceCompare(String s, String t) 
        {
            if (StringCompare(s).equals(StringCompare(t)))
                return true;
            else
                return false;
        }
    
        private Stack<Character> StringCompare (String text){
            
            Stack <Character> stack = new Stack<>();
    
            for (char c: text.toCharArray()){
                if (c != '#'){
                    stack.push(c);
                }
                else if (c == '#' && !(stack.isEmpty()))
                    stack.pop();
            }
            return stack;
        }
}
