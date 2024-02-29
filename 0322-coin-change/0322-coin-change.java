class Solution {
  
    public int recur(int[] coins,int amt,int[] dp){
        //i have to return the min number
        //of coins i need to make amt
        if(amt == 0) return 0;//zero coins are req to make 0
        if(amt < 0) return 100000;
        if(dp[amt]!=0)return dp[amt];
        int ans = 100000;
        for(int coin:coins){
            int remSum = amt - coin;
            int countOfMakingRemSum = recur(coins,remSum,dp);
            ans = Math.min(ans,countOfMakingRemSum);
        }
        dp[amt]=ans+1;
        return ans+1;
    }
    public int coinChange(int[] coins, int amount) {
        int[] dp=new int[amount+1];

         int ans= recur(coins,amount,dp);
         if(ans>=100001){
             return -1;
         }
         else{
             return ans;
         }
    }
}