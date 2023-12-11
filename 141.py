class ListNode:
    def __init__(self, val = 0, next = None):
        self.val = val
        self.next = next
class solution(object):
    def hasCycle(self, head):
        if not head or not head.next:
            return False
        fast = head 
        slow = head
        while fast and fast.next:
            fast = fast.next.next
            slow = slow.next
            if fast == slow:
                return True
        return False
        
if __name__=="__main__":
    node1 = ListNode(3)
    node2 = ListNode(2)
    node3 = ListNode(0)
    node4 = ListNode(-4)
    
    node1.next = node2
    node2.next = node3
    node3.next = node4
    node4.next = node2
    solution_obj = solution()

    has_cycle = solution_obj.hasCycle(node1)
    if has_cycle:
        print("Yes")
    else:
        print("No")