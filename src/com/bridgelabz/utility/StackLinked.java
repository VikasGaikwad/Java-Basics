package com.bridgelabz.utility;

class Node <T>{

	private T data;
	private Node<T> link;

	public Node(T data,Node<T> node) {
		data=data;
		link=node;

	}

	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public Node<T> getLink() {
		return link;
	}
	public void setLink(Node<T> link) {
		this.link = link;
	}
}
public class StackLinked<T> {
	private Node<T> top;
	private int size;
	public StackLinked() {
		top=null;
		size=0;
	}
	public void push(T element) {
		Node<T> new_data=new Node<T>(element,null);
		if(top==null) {
			top=new_data;

		}
		else {
			new_data.setLink(top);
			top=new_data;
		}
		size++;
	}
	public boolean isEmpty() {
		return top==null;
	}
	public T pop() {
		Node <T> new_node=null;
		T element=null;
		if(isEmpty()) 
			System.out.println();

		new_node=top;
		top=new_node.getLink();
		element=new_node.getData();
		size--;
		return element;
	}
	public T peek() {
		if(isEmpty()) 
			System.out.println("stack is empty : ");


		return top.getData();

	}
	public int size() {
		return size;
	}

}
