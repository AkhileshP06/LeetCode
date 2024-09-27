class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        // Map for closing to opening brackets
        HashMap<Character, Character> bracketMap = new HashMap<>();
        bracketMap.put(')', '(');
        bracketMap.put('}', '{');
        bracketMap.put(']', '[');
        
        // Iterate through each character in the string
        for (char c : s.toCharArray()) {
            // If it's a closing bracket
            if (bracketMap.containsKey(c)) {
                // Pop from stack if not empty, else assign a dummy value
                char topElement = stack.isEmpty() ? '#' : stack.pop();
                // Check if the popped bracket matches
                if (topElement != bracketMap.get(c)) {
                    return false;
                }
            } else {
                // It's an opening bracket, push onto the stack
                stack.push(c);
            }
        }
        
        // If the stack is empty, all brackets are matched; otherwise, they're not
        return stack.isEmpty();
        
    }
}