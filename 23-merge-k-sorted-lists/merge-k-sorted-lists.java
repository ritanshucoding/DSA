class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(ListNode head: lists){
            while(head!=null){
            arr.add(head.val);
            head=head.next;
        }
    }
        Collections.sort(arr);
        ListNode list1 = new ListNode(0);
        ListNode curr = list1;
        for(int num: arr){
            curr.next=new ListNode(num);
            curr=curr.next;
        }
        return list1.next;
    }
}