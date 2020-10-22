package leetcode;

/**
 * @author klaus
 * @date 2020/10/14 14:01
 */
public class Solution25 {

    private ListNode reverseKGroup(ListNode head,int k){
        ListNode hair=new ListNode(0);
        hair.next=head;

        ListNode pre=hair;
        ListNode end=hair;

        while (end.next!=null) {
            for (int i = 0; i < k && end!=null; i++) {
                end=end.next;
            }
            if (end==null){
                break;
            }
            ListNode start=hair.next;
            ListNode next=end.next;
            end.next=null;
            pre.next=reverse(start);
            start.next=next;
            pre=start;
        }
        return hair.next;
    }

    private ListNode reverse(ListNode head){
        ListNode pre=head;
        ListNode cur=null;
        while (head!=null) {
            ListNode s=head.next;
            head.next=cur;
            cur=head;
            head=s;
        }
        return cur;
    }
}
