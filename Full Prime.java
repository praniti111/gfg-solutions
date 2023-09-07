//
q: https://practice.geeksforgeeks.org/problems/full-prime2659/1?page=1&category[]=Prime%20Number&sortBy=submissions
class Solution{
	static int fullPrime(int N){
	    if(prime(N) && check(N)){
	        return 1;
	    }
	    return 0;
	    
	}
	    //code here
static boolean check(int N){	   
	    int digit = 0;
	    while(N>0){
	        digit  = N%10;
	        if(prime(digit) && digit>0){
	            N = N/10;
	        }
	        else{
	        return false;
	            
	        }
	    }
	   return true;
}
	
	static boolean prime(int digit){
	    if(digit ==1) return false;
	    
	    for(int  i =2;i<=Math.sqrt(digit);i++){
	        if(digit%i==0) return false;
	    }
	    return true;
	}
}
