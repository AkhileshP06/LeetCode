class Solution {
public int climbStairs(int n) {
int[] dp=new int [n+1];
process(n,dp);
return dp[n];
}
public static int process(int n,int[] dp)
{
if(n==0)
return dp[n]=0;
if(n==1)
return dp[n]=1;
if(n==2)
return dp[n]=2;
if(dp[n]!=0)
return dp[n];
return dp[n]=process(n-1,dp)+process(n-2,dp);
}
}