/*Q: https://practice.geeksforgeeks.org/problems/twisted-prime-number0500/1?page=2&category[]=Prime%20Number&sortBy=submissions  */

class Solution {
    int isTwistedPrime(int N) {
        // code here
        
        int digit = reverse(N);
        
        if(prime(N) && prime(digit)){
            return 1;
        }
        return 0;
    }
    int reverse(int N){
        int ans = 0;
        while(N>0){
            int sum =N%10;
            ans = ans*10+sum;
            N = N/10;
        }
        return ans;
    }
    
    boolean prime(int N){
        if(N ==1) return false;
        
        for(int i=2;i<=Math.sqrt(N);i++){
            if(N%i ==0) return false;
        }
        return true;
    }
}
