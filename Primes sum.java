/* Q: https://practice.geeksforgeeks.org/problems/primes-sum5827/1?page=1&category[]=Numbers&sortBy=submissions */
class Solution{
   static String isSumOfTwo(int N){
     for(int i=2;i<=N/2;i++){ // this will start from 2(as 2 is the smallest prime) and go till half of the Number N as till then the prime number in the first place would have been found
       if(prime(i) && prime(N-i)){ // this will check for the number in i's place and number in N-i's place if they both are prime or not
         return "Yes";
       }
     }
     return "No";
   }
  static boolean prime(int N){ // function to check if the number is prime or not
    for(int i=2;i<=Math.sqrt(N);i++){// will iterate only till the square root of that number
      if(N%i == 0) return false;// if it is divisible by any number other than 1 and the number itself then it is not the prime and returns false
    }
    return true;
  }
}
