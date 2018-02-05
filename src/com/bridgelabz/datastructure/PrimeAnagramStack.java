package com.bridgelabz.datastructure;

public class PrimeAnagramStack<T> {
	Node top;
	public int size;
	private class Node{
		protected Node next;
		protected T data;
		Node(T data,Node next){
			this.data=data;
			this.next=next;
			
		}
		public void setData(T data) {
			this.data=data;
		}
		public T getData() {
			return data;
		}
		public void setLink(Node next) {
			this.next=next;
		}
		public Node getLink() {
			return next;
		}
	}
	PrimeAnagramStack(){
		
	}

}
