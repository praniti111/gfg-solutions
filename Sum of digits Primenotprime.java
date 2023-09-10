/*Q: https://practice.geeksforgeeks.org/problems/sum-of-digits-prime-non-prime1935/1?page=2&category[]=Prime%20Number&sortBy=submissions */

class Solution{
		int digitSum(int N){
		    //code here
		    int sum = 0;
		    while(N!=0){
		            int digit = N%10;
		            sum = sum + digit; 
		            N = N/10;
		    }
		    return sum;
	}
	 int digitPrime(int N){
	     while(digitSum(N)>9){
	         N=digitSum(N);
	     }
	    int val = digitSum(N);
	    if(val ==2 || val == 3 || val == 5 || val == 7){
	        return 1;
	    }
	    return 0;
	}
}
