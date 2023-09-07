/*Q: https://practice.geeksforgeeks.org/problems/the-amazing-number0459/1?page=2&category[]=Prime%20Number&sortBy=submissions */

class Solution {
    static long isAmazing(long n){
      int flag = 2; // checking from 2 coz 1 and the number itself will always be divisible by the number
      for(int i = 2;i<n;i++){ // starting from 2
        if(n%i==0){
          flag++;
        }
        if(flag>3){
          return 0;
        }
      }
      if(flag==3){
        return 1;
      }
      return 0;
    }
}
