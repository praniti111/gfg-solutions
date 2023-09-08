/*Q:https://practice.geeksforgeeks.org/problems/product-of-prime-factors5121/1?page=2&category[]=Prime%20Number&sortBy=submissions  */

class Solution{
    static long primeProduct(int N) 
    { 
        // code here
        
        int ans =1;
        for(int i=2; i<=N;i++){
            if(N%i ==0){
                if(prime(i)){
                    ans = ans*i;
                }
            }
        }
        return ans;
    }
    
    
    static boolean prime(int N){
        if(N==1) return false;
        for(int i = 2;i<=Math.sqrt(N);i++){
            if(N%i ==0) return false;
        }
        return true;
    }
}
