package LinkedList;
import java.util.Scanner;
public class LC203 {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int val){this.val = val;}
        ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }
    }
    public ListNode removeElements(ListNode head, int val){
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode cur = dummy;
        while(cur.next != null){
            if(cur.next.val == val){
                cur.next = cur.next.next;
            }else{
                cur = cur.next;
            }
           
        }
        return dummy.next;
    }
    private void printList(ListNode head){
        ListNode cur = head;
        while(cur != null){
            System.out.println(cur.val +" ");
            cur = cur.next;
        }
        System.out.println(" ");
        return;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter List");
        String[] split = in.nextLine().split(" ");
       
        LC203 test = new LC203();
        ListNode dummy = test.new ListNode(-1);
        ListNode cur = dummy;
        for(int i = 0; i < split.length; i++){
            int tmp = Integer.parseInt(split[i]);
            cur.next = test.new ListNode(tmp);
            cur = cur.next;
        }
        System.out.println("Enter the target number");
        int target = in.nextInt();
        in.close();
        ListNode res = test.removeElements(dummy.next, target);
        test.printList(res);
    }
}
