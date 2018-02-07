package com.bridgelabz.utility;

class Node1<T> {

	private Node1<T> link;
	private T data;

	public Node1(T mData, Node1<T> node) {
		data = mData;
		link = node;
	}

	
	public void setData(T data) {
		this.data = data;
	}

	
	public void setLink(Node1<T> rear) {
		this.link = rear;
	}

	
	public Node1<T> getLink() {
		return link;
	}

	public T getData() {
		return data;
	}
}

public class QueueLinked<T> {

	private Node1<T> front;
	private Node1<T> rear;
	private int size;

	public QueueLinked() {
		size = 0;
		rear = null;
		front = null;
	}

	public  void enQueue(T element) {
		Node1<T> nd = new Node1<T>(element, null);
		if (rear == null) {
			rear = nd;
			front = nd;
		} else {
			rear.setLink(nd);
			rear = rear.getLink();
		}
		size++;
	}

	
	public T deQueue() {
		Node1<T> nd = null;
		T element = null;
		if (isEmpty()) {
			size = 0;
			System.out.println("Queue is empty");
		}
		if (front == null)
			rear = null;
		nd = front;
		front = nd.getLink();
		element = nd.getData();
		return element;
	}

	/*
	 * This method helps to retrieve the data from queue
	 * 
	 * @returns the value in a particular node
	 */
	public T peek() {
		if (isEmpty())
			System.out.println("Queue is empty..!!");
		return front.getData();
	}

	
	public boolean isEmpty() {
		return (front == null);
	}

	
	public int size() {
		return size;
	}
}