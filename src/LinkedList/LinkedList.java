package LinkedList;

import java.awt.List;

public class LinkedList {

	// this class has a default constructor:-
	public LinkedList() {
		length = 0;
	}

	// this is the only field of the class. It holds the head of the list.

	ListNode head;

	// Length of the linked list

	private int length = 0;

	// return the first node in the list
	public synchronized ListNode getHead() {
		return head;
	}

	// insert a node at the beginning of the list
	public synchronized void insertAtBegin(ListNode node) {

		node.setNext(head);
		head = node;
		length++;
	}

	// insert a node at the end of the list
	public synchronized void insertAtEnd(ListNode node) {

		if (head == null)
			head = node;
		else {

			ListNode p, q;
			for (p = head; (q = p.getNext()) != null; p = q) {

				p.setNext(node);
			}
			length++;
		}
	}

	// add a new value to the list at a given position
	// all values at that position to the end move over to make room
	public void insert(int data, int position) {

		// fix the position
		if (position < 0)
			position = 0;
		if (position > length)
			position = length;
		// if the list is empty, make it be the only element
		if (head == null)
			head = new ListNode(data);
		// if adding at the front of the list
		if (position == 0) {
			ListNode temp = new ListNode(data);
			temp.next = head;
			head = temp;
		}
		// else find the correct position and insert
		else {
			ListNode temp = head;
			for(int i=1;i<position;i+=1){
				temp = temp.getNext();
			}
			ListNode newNode = new ListNode(data);
			newNode.next=temp.next;
			temp.setNext(newNode);

		}
		length+=1;
	}
	
	//remove and return the node at the head of the list
	public synchronized ListNode removeFromBegin(){
		
		ListNode node = head;
		if(node !=null){
			head=node.getNext();
			node.setNext(null);
		}
		return node;
	
		
	}
	
	//remove and return the node at the end of the list
	public synchronized ListNode removeFromEnd(){
		
		if(head == null)
			return null;
		ListNode p = head,q=null,next=head.getNext();
		if(next == null){
			head = null;
			return p;
		}
		while((next=p.getNext())!=null){
			q=p;
			p=next;
		}
		q.setNext(null);
		return p;
	}
	
	//remove a node matching the specified node from the list
	//use equals() instead of == to test for a matched node.
	public synchronized void removeMatched(ListNode node){
		if(head==null)
			return;
		if(node.equals(head)){
			head=head.getNext();
			return;
		}
		
		ListNode p =head,q=null;
		
		while((q=p.getNext())!=null){
			if(node.equals(q)){
				p.setNext(q.getNext());
				return;
			}
		}
	}
	
	//remove the value at a given position
	//if the position is less than 0, remove the value at position 0.
	//if the position is greater than 0,remove the value at the last position
	public void  remove(int position){
		//fix position
		if(position<0){
			position=0;
		}
		if(position>=length){
			position=length-1;
		}
		//if nothing in the list, do nothing
		if(head==null)
			return;
		//if removing the head element...
		if(position==0){
			head=head.getNext();
		}
		
		//else advance to the correct position and remove
		else{
			
			ListNode temp = head;
			for(int i=1;i<position;i+=1){
				temp=temp.getNext();
			}
			temp.setNext(temp.getNext().getNext());
		}
		//reduce the length of the list
		length-=1;
	}
	
	//return a string representation of this collection, in the form[str1 str2]
	
	public String toString(){
		
		String result = "[";
		if(head==null){
			return result+"]";		
		}
		result=result+head.getData();
		ListNode temp=head.getNext();
		
		while(temp!=null){
			
			result=result+","+temp.getData();
			temp =temp.getNext();
			System.out.println(result);
		}
		return "Final - "+result+"]";
	}
}
