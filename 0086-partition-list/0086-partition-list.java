class Solution {
    public ListNode partition(ListNode head, int x) {
        if(head == null) return null;

        ListNode temp = null;
        ListNode ptr = head;

        // Find first node >= x
        while(ptr != null){
            if(ptr.val < x){
                if(temp == null){
                    temp = head;
                }else{
                    temp = temp.next;
                }
                ptr = ptr.next;
            }else{
                break;
            }
        }

        if(ptr == null){
            return head;
        }

        ListNode ptr1 = ptr.next;

        while(ptr1 != null){
            if(ptr1.val < x){

                // Remove ptr1
                ptr.next = ptr1.next;

                if(temp == null){
                    // Insert at head
                    ptr1.next = head;
                    head = ptr1;
                    temp = head;
                }else{
                    // Insert after temp
                    ptr1.next = temp.next;
                    temp.next = ptr1;
                    temp = temp.next;
                }

                ptr1 = ptr.next;
            }else{
                ptr = ptr.next;
                ptr1 = ptr1.next;
            }
        }

        return head;
    }
}