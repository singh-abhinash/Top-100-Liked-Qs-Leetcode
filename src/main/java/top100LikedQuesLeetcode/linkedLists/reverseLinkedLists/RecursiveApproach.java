package top100LikedQuesLeetcode.linkedLists.reverseLinkedLists;

// Recursive Approach - O(n) time and O(n) space (due to recursive call stack).
public class RecursiveApproach {
	public ListNode helper(ListNode currNode, ListNode prevNode) {
        if (currNode == null) {
            return prevNode;
        }
        ListNode nextNode = currNode.next;
        currNode.next = prevNode;
        return helper(nextNode, currNode);
    }

    public ListNode reverseList(ListNode head) {
        return helper(head, null);
    }
}
