// Segregate even and odd nodes in a Link List // Odd even ll "BY VALUE"
//Given a link list of size N, modify the list such that all the even numbers appear before all the odd numbers in the modified list. The order of appearance of numbers within each segregation should be same as that in the original list.

//NOTE: Don't create a new linked list, instead rearrange the provided one.

/* 
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution
{
   Node divide(int N, Node head)
   {
      Node oddHead = new Node(-1);
      Node evenHead = new Node(-1);
      Node odd = oddHead, even = evenHead;
      
      while(head!=null)
      {
        if(head.data%2==1) //Check if the number is odd
        {
          odd.next = head;
          odd = head;
        }
        else
        {
          even.next = head;
          even = head;
        }
        head = head.next;
      }
      
      odd.next = null;
      even.next = oddHead.next;
      
      return evenHead.next;
   }
}
