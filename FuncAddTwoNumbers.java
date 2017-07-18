/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode output = new ListNode(0);
        ListNode outputPntr=output;
        int carryFwd=0;
        int sum =0;
       //ListNode output = new ListNode(3);
        while(l1!= null||l2!=null){  
            //System.out.println(l1.val);  
            //l1.next;
            //l1=l1.next;
            //System.out.println(l1.next.val);  
            if(l1 == null){
                sum = carryFwd  + l2.val;
                l2=l2.next;
            }
            else if(l2 == null) {
                sum = carryFwd + l1.val ;
                l1=l1.next;
            }
            else{
                sum = carryFwd + l1.val + l2.val;
                l1=l1.next;
                l2=l2.next;
            }
            //System.out.println("in outer loop"+sum%10);  
            output.next = new ListNode(sum%10);
            if(sum>9){                
                carryFwd=sum/10;
                //System.out.println("in inner loop"+carryFwd);  
            }else {
                carryFwd=0;
            }
             System.out.println();  

            output=output.next;
        }  
        if(carryFwd>0)
        output.next = new ListNode(carryFwd);
        //System.out.println("1"+outputPntr.val);  
        //System.out.println("2"+outputPntr.next.val);  
        //System.out.println("3"+outputPntr.next.next.val);  
    return outputPntr.next;
    }
}