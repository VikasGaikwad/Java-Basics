package com.bridgelabz.oop;

import java.util.Scanner;

/**purpose:Maintain the List of CompanyShares in a Linked List. 
 * @author bridgeit
 *@since-:09-feb-2018
 */
public class CompanyShare {
	

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);

		LinkedList list = new LinkedList();
		
		System.out.println();
		
		while(true)
		{
			System.out.println();
			System.out.println("1. add the shares");
			System.out.println("2. remove the shares");
			System.out.println("3. Display the shares");
			System.out.println("4. total shares");
			System.out.println("5. Exit");
			int choice =scanner.nextInt();
			switch (choice)
			{
			case 1 :
				System.out.println("Enter element to insert");
				list.insertbegin(scanner.nextInt());
				break;

			case 2 :
				System.out.println("Enter position");

				int position = scanner.nextInt();
				list.deletenode(position);
				System.out.println("remove successfuly");
				break;

			case 3:
				System.out.print("Shares are: ");
				list.printList();

				break;
			case 4 :
				System.out.println("Size = "+ list.size() +" \n");
				break;
			case 5: System.exit(0);
			default :
				System.out.println("Wrong Entry \n ");
				break;
			}
			scanner.close();
		}
		
	}

}
