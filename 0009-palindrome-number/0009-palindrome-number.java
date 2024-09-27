class Solution {
    public boolean isPalindrome(int x) {
        if(x<0 || (x%10==0 && x!=0)) return false;

        int rh = 0;
        while (x>rh)
        {
            rh = rh * 10 + x%10;
            x /= 10;
        }

        return x==rh || x==rh/10;
    }
}