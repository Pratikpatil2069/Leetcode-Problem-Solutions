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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode arr[] = new ListNode[k];

        if (head == null) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = head;
            }
            return arr;
        }

        int numOfNodes = 0;
        ListNode temp = head;
        while (temp != null) {
            numOfNodes++;
            temp = temp.next;
        }

        int partSize = numOfNodes / k;
        int firstPartsSize = numOfNodes % k;

        int i = 0;
        ListNode ptr = head;

        while (ptr != null && i < k) {
            arr[i] = ptr;

            int currentPartSize = partSize + (firstPartsSize > 0 ? 1 : 0);
            if (firstPartsSize > 0) {
                firstPartsSize--;
            }

            for (int j = 1; j < currentPartSize; j++) {
                if (ptr != null) {
                    ptr = ptr.next;
                }
            }
            if (ptr != null) {
                ListNode next = ptr.next;
                ptr.next = null;
                ptr = next;
            }

            i++;
        }

        return arr;
    }
}
