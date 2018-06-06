package LinkedList;

public class linklistObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(10);
		LinkedList ll = new LinkedList();
		ll.insert(20, 1);
		ll.insert(30, 2);
		ll.insert(40, 3);
		ll.insertAtBegin(head);
		System.out.println(ll.toString());
	}

}
