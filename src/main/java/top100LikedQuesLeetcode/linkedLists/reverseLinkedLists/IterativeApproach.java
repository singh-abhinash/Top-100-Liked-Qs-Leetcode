package top100LikedQuesLeetcode.linkedLists.reverseLinkedLists;

class ListNode {
	 int val;
	 ListNode next;
	 ListNode() {}
	 ListNode(int val) { this.val = val; }
	 ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

// Iterative Approach - O(n) time and O(1) space.
public class IterativeApproach {
	public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode prevNode = null;
        ListNode currNode = head;
        ListNode nextNode;
        while (currNode != null) {
            nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        return prevNode;
    }
}
