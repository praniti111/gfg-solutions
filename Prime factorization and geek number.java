/* Q: https://practice.geeksforgeeks.org/problems/prime-factorization-and-geek-number1915/1?page=2&category[]=Prime%20Number&sortBy=submissions*/

Class Solution{
  static int geekNumber(int N){
    int i = 2;

    while(i*i<=N) // checks only till the prime factors
    {
      int count = 0; // checker for how many times did the loop run and it is uner the while loop1 as the count will again be 0 when i++;
      while(N%i==0)//while loop2 checks if the number N is divisible by i or not
      {
        N = N/i; // divides the number i divisle with 
        count++;
      }
      if(count>1) return 0;// if count greater than 1 hence the number is not a geek number

      i++;
    }

    return 1;
    
  }
}
