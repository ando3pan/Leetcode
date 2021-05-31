/*
Binaray tree node set up
public class Treenode{
  int val;
  Treenode left;
  Treenode right;
  Treenode(int x) {val = x;}
}
*/
class Solution{
  public ListNode mergeTwoLists(ListNode l1, Listnode l2){
    ListNode dummy = new ListNode(-1);
    ListNode head = dummy;
    while(l1 != null && l2 != null){
      if(l1.val < l2.val){
        dummy.next = l1;
  //use the .next function to go to adjacent node
  //the next thing on the new list is the smaller one
        l1 = l1.next;
  //move forward on l1
      }else{
        dummy.next = l2;
  //the next thing on the new list is the smaller one
        l2 = l2.next;
      }
      dummy = dummy.next;
  //just to make sure we move dummy forward
  // once the dummy break, it at least does finishes one list
      if(l1 != null){
        dummy.next = l1;
  //if the list is empty, the rest of the other list is added
      }else{
        dummy.next = l2;
  //same thing, but with other list
      }
    }
    return head;
  }
}
