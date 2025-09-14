// Find the maximum Wealth of the person (LeetCode 1672)-Easy


public class MaxWealth {
    class Solution {
        public int maximumWealth(int[][] accounts) {
            
            // sabse pehle ek ans var me min value ko store krenge or last me isse hi compare krenge ki isse bara h ky or agr h to isme daal kr isko hi return kr denge
            int ans = Integer.MIN_VALUE;
            // ab 2d array ka qtn h to ek row h outer loop me or inner loop me col h jisme outer loop arr k length tk iterate krega
            for(int row = 0; row<accounts.length; row++){
                // ek sum var banaenge jisme me ek row k sare cols ko add kr k store krenge or isko ans se compare kr denge
                int sum = 0;
                // ab ye inner loop row k cols me iterate krega 
                for(int col = 0; col<accounts[row].length; col++){
                    // ab sum var me array k har ek row k sab cols add kr k row me store krenge or vo row sum me bhej denge
                    sum = sum + accounts[row][col];
                }
                // now compare
                if(sum > ans){
                    ans = sum;
                }
            }
            // ab return kr denge jo v ans me store hoga and all set!
            return ans;
        }
        }
    
}
