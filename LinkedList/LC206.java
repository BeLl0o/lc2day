package LinkedList;
import java.util.*;

public class LC206 {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
        ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }
    }
    public ListNode reverseList(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
    private void printList(ListNode head){
        ListNode cur = head;
        while(cur != null){
            System.out.println(cur.val + " ");
            cur = cur.next;
        }
        System.out.println(" ");
        return;
    }
    private ListNode readList(String[] split){
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        for(String s : split){
            cur.next = new ListNode(Integer.parseInt(s));
            cur = cur.next;
        }
        return dummy.next;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        LC206 test = new LC206();
        System.out.println("Enter the List");
        String[] split = in.nextLine().split(" ");
        in.close();
        ListNode head = test.readList(split);
        head = test.reverseList(head);
        test.printList(head);
        return;
    }
}
