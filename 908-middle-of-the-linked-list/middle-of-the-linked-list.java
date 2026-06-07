class Solution {
    public int length(ListNode head) {
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
    public ListNode middleNode(ListNode head) {
        int len = length(head);
        int mid = len / 2;
        ListNode temp = head;
        for (int i = 0; i < mid; i++) {
            temp = temp.next;
        }
        return temp;
    }
}