public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> set = new HashSet<>();

        // Store nodes of list A
        while (headA != null) {
            set.add(headA);
            headA = headA.next;
        }

        // Check nodes of list B
        while (headB != null) {
            if (set.contains(headB)) {
                return headB;
            }
            headB = headB.next;
        }

        return null;
    }
}
