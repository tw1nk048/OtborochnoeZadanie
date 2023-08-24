public class Main {
    public static void main(String[] args) {
        ListNode list = new ListNode(4);
        list.next = new ListNode(3);
        list.next.next = new ListNode(2);
        list.next.next.next = new ListNode(1);

        System.out.println("Изначальный односвязный список");
        list.printList(list);
        list = list.reverse(list);
        System.out.println("");
        System.out.println("Результат:");
        list.printList(list);
    }
}