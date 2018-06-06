package LinkedList;

public class ListNode {

	private int data;
	 ListNode next;

	public ListNode(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setNext(ListNode next) {
		this.next = next;
	}

	public ListNode getNext() {
		return this.next;
	}

	public int ListLength(ListNode headNode){
		int length = 0;
		ListNode currentnode = headNode;
		while(currentnode != null){
			length++;
			currentnode=currentnode.getNext();
		}
			return length;
	}


}


