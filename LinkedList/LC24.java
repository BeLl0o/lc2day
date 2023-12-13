package LinkedList;

public class LC24 {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int val){this.val = val;}
        ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }
    }
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode dummy = new ListNode(-1, head);
        ListNode cur = dummy;
        ListNode tmp = cur.next;
        cur.next.next = cur.next.next.next;

    }

    public static void main(String[] args){
        
    }
}
