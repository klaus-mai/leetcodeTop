package leetcode;

/**
 * @author klaus
 * @date 2020/9/25 11:00
 */
public class TwoAdd {
    public ListNode twoAdd(ListNode l1,ListNode l2){
         ListNode node=new ListNode(0);
         int carry=0;
         while (l1!=null||l2!=null||carry!=0){
             int sum=carry;
             if (l1!=null){
                 sum+= l1.val;
                 l1=l1.next;
             }
             if (l2!=null){
                 sum+= l2.val;
                 l2=l2.next;
             }
             node.next=new ListNode(sum%10);
             node=node.next;
             carry=sum/10;
         }
        return node.next;
    }
}
