class Solution
{
    //Function to rotate an array by d elements in counter-clockwise direction. 
    static void rotateArr(int arr[], int d, int n)
    {
        // add your code here
             d = n - d;
     
     //to handle greater values of d
     d = d%n;
     
     //to handle neagtive values of d
     if(d<0) d=d+n;
     
     //individual reverse of 1st block
     reverse(arr,0,n-d-1);
     
     //indiviadual reverse of 2nd block
     reverse(arr, n-d,n-1);
     
     //revese the whole array
     reverse(arr,0,n-1);
     
    
}
 public static void swap(int arr[], int left, int right)
{
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    
}

public static void reverse(int arr[], int left, int right)
{
    while(left<right)
    {
        swap(arr,left,right);
        left++;
        right--;
    }
}
