class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int[] arr1=new int[100];
        int[] arr2=new int[100];
        int[] arr3=new int[101];
        ListNode temp1=l1;
        ListNode temp2=l2;
        int n1=0, n2=0;
        // Fill arr1
        while (temp1!=null) {
            arr1[n1++]=temp1.val;
            temp1=temp1.next;
        }
        // Fill arr2
        while(temp2!=null) {
            arr2[n2++]=temp2.val;
            temp2=temp2.next;
        }
        int len=Math.max(n1, n2);
        int carry=0;
        // Add the digits
        for (int i=0;i<len;i++) {
            int sum=arr1[i]+arr2[i]+carry;
            arr3[i]=sum%10;
            carry=sum/10;
        }
        if (carry>0) {
            arr3[len]=carry;
            len++;
        }
        // Convert arr3 to linked list
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for (int i = 0; i < len; i++) {
            curr.next = new ListNode(arr3[i]);
            curr = curr.next;
        }
        return dummy.next;
    }
}