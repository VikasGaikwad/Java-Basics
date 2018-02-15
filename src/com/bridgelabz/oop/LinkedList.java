package com.bridgelabz.oop;

public class LinkedList {

	ListNode6 head;
	int length;

	public int size(){


		return length;
	}
	public void insertbegin(int data){

		ListNode6 node = new ListNode6(data);
		node.next = head;
		head = node;
		length++;

	}

	public void insertend(int data){

		ListNode6 node = new ListNode6(data);
		if(head == null){
			head = node;

		}
		else{

			ListNode6 temp = head;
			while(temp.next!=null){

				temp = temp.next;
			}
			temp.next = node;
			length++;
		}
	}

	public void insertmiddle(int data, int position){

		ListNode6 temp = head;

		for(int i = 1; i<position;i++){

			temp = temp.next;
		}
		ListNode6 node = new ListNode6(data);
		node.next = temp.next;
		temp.next=node;
		length++;
	}

	public void deletefirstnode(){

		ListNode6 temp = head;
		head = head.next;
		temp.next = null;
		length--;
	}

	public void deletelastnode(){

		ListNode6 last = head;
		ListNode6 previousTolast = null;
		while(last.next!=null){

			previousTolast = last;
			last = last.next;
		}
		previousTolast.next = null;
		length--;
	}
	public void deletenode(int position){

		if(position == 1){

			ListNode6 temp = head;
			head =head.next;
			temp.next = null;

		}
		length--;
	}
	public void printList()
	{
		ListNode6 tnode = head;
		while (tnode != null)
		{
			System.out.print(tnode.data+" ");
			tnode = tnode.next;
		}
	}
}