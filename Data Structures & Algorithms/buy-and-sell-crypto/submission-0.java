class Solution {
    public int maxProfit(int[] prices) {
    int a =0;
    int max = 0 ;
    while(a<prices.length-1){
        for(int i=a+1;i<prices.length;i++){
                if((prices[i]-prices[a])<=0){
                    continue;
                }
                max = Math.max(max,(prices[i]-prices[a]));
        }
        a++;
    }
    return max;
    }
}
