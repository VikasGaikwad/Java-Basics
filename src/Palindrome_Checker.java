import java.util.ArrayDeque;
import java.util.Scanner;


	
	class Deque<T>{
		private int front;
		private int rear;
		private int size;
		private T arr[];
		
		
		Deque(int size){
			this.front =-1;
			this.rear = -1;
			this.size=size;
			arr = (T[]) new Object[size];
		}
		
		public boolean isFull() {
			if(rear==size-1){
				return true;
			}
			return false;
		}
		public boolean isEmpty(){
			if(front==rear){
				return true;
			}else {
				return false;
			}
		}
		public void Enqueue(T ch) {
			if(isFull()) {
				System.out.println("Queue is full");
			}
			else {
				rear++;
				arr[rear] = ch;
			}
		}
		public T Front() {
			front++;
			return arr[front];
		}
		public T rear() {
			return arr[rear--];
		}
		public void dequeue() {
			if(isEmpty()){
				System.out.println("Queue is empty");
			}
				front++;
		}
		
		public boolean compare(int length) {
		int len=(length/2)+1;
		int i=0;
		  for( ;i<len;i++) {
			  if(Front()==rear()){
				  dequeue();
				  rear--;
			  }
			  else {
				  break;
			  }
		  }
		  if(i==len) {
			  return true;
		  }else {
			  return false;
		  }
		
		}
	}
	
	public class Palindrome_Checker {
		public static void main(String []args) {
			Scanner scanner =new Scanner(System.in);
			
			System.out.println("Enter a string :");
			String string = scanner.nextLine();
			char ch[]=string.toLowerCase().toCharArray();
			int length = ch.length;
			Deque deque = new Deque(length);
			for(int i=0;i<length;i++) {
				deque.Enqueue(ch[i]);
			}
			 if(deque.compare(length)) {
				 System.out.println("String is palindrom");
			 }
			 else {
				 System.out.println("String is not palindrom");
			 }
		}
	}
