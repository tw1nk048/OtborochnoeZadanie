public class ListNode {
    int number;
    ListNode next;
    ListNode(int num)
    {
        number = num;
        next = null;
    }
    ListNode reverse(ListNode list)
    {
        ListNode prev = null;
        ListNode current = list;
        ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    void printList(ListNode list)
    {
        while (list != null) {
            System.out.print(list.number + " ");
            list = list.next;
        }
    }
}
