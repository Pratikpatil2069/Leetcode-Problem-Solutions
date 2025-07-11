/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Step 1: Calculate lengths
        int n1 = 0, n2 = 0;
        ListNode temp = l1, temp2 = l2;
        while (temp != null) {
            n1++;
            temp = temp.next;
        }
        while (temp2 != null) {
            n2++;
            temp2 = temp2.next;
        }

        // Ensure l1 is the longer list
        if (n2 > n1) {
            // Swap l1 and l2
            ListNode t = l1; l1 = l2; l2 = t;
            int tmp = n1; n1 = n2; n2 = tmp;
        }

        int maxNode = n1 - n2;
        Stack<ListNode> stack = new Stack<>();
        temp = l1;
        temp2 = l2;

        // Step 2: Align lists and add nodes
        while (temp != null) {
            if (maxNode > 0) {
                stack.push(temp);
                temp = temp.next;
                maxNode--;
            } else {
                int sum = temp.val + temp2.val;
                temp.val = sum % 10;

                if (sum >= 10) {
                    // Carry propagation
                    boolean carryHandled = false;
                    while (!stack.isEmpty()) {
                        ListNode top = stack.pop();
                        if (top.val != 9) {
                            top.val += 1;
                            carryHandled = true;
                            break;
                        } else {
                            top.val = 0;
                        }
                    }
                    if (!carryHandled) {
                        ListNode newHead = new ListNode(1);
                        newHead.next = l1;
                        l1 = newHead;
                    }
                }

                stack.push(temp); // Add current processed node
                temp = temp.next;
                temp2 = temp2.next;
            }
        }

        return l1;
    }
}
