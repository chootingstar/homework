package employment_package;

public class LinkedListOfEmployees {
	private Node head;
	
	public LinkedListOfEmployees() {
		head = null;
	}
	
	//Much of my coding from here on is from inspiration
	//by this YouTube series: https://www.youtube.com/watch?v=SMIq13-FZSE

	public void insertAtFront(Employee e) {
		//TODO
		//this method inserts at the front of the linked list.
		//Original thought process... Seems inefficient
		//---------------------
		Node node = new Node(e);
		Node curNode = head;
		Node save = curNode;
		head = node;
		node.setNext(save);//Possible errors such as the linkedlist being totally
		//disconnected when the new node is inserted
		//---------------------
	}
	
	public void insertAtEnd(Employee e) {
		//TODO
		//this method inserts at the end of the linked list.
		Node n = new Node(e);
		//The following is really close to the youtube videos', and I would like
		//to go back and redo it so that the code is more my own.
		//The more I look at it, the more it looks copied
		if(n.getNext() == null) {
			head = n.getNext();
		} else  {
			Node node = head;
			while(node.getNext() != null) {
				node = node.getNext();
			}//A lot of corrections popped up on Eclipse, apparently
			//Eclipse really likes the preset code from Node.java
			n.setNext(node);
		}
	}
	
	public int countEmployees(String g) {
		//TODO
		//this method returned the number of employees who are of the gender g.
		Node node = head;
		int count = 0;
		if (node.getNext() != null)
		while(node.getNext() != null) {
			node = node.getNext();
			if(node.getData(g) == g) count++;
		} else {
			System.out.println("There are no employees");
		}
		return count;
	}
	
	public Employee getOldestEmployee() {
		//TODO
		//this method returns the name of the oldest employee
		Node node = head;
		Employee oldie; //interesting, it accepts Employee as a data type...
		//... I wonder if that means I can access Employee directly, or I'm somehow
		//accessing the registered data type accepted by Node.java
		if (node.getNext() != null)
		while(node.getNext() != null) {
			node = node.getNext();
		    
		} else {
			System.out.println("There are no employees");
		}
		return oldie;
	}
	
	public LinkedListOfEmployees getEmployees(String g) {
		//TODO
		//this method returns a linked list of all employees who are of gender g.
		return head.getData();
	}
	
	public void split(LinkedListOfEmployees male, LinkedListOfEmployees female) {
		//TODO
		//this method inserts all Male employees into a linked list male
		//and Female into female linked list.
		
	}
}
