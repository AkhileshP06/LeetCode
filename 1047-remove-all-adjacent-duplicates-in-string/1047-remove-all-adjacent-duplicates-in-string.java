class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stk = new Stack<>();
        for (char c : s.toCharArray())
        {
            if(!stk.isEmpty() && stk.peek() == c)
            {
                stk.pop();
            }
            else
            {
                stk.push(c);
            }
        }
        StringBuilder res = new StringBuilder();
        for (char c : stk)
        {
            res.append(c);
        }
        return res.toString();
    }
}