package LinkedList;

public class DoubleListTraverse {
	
	
	public void printFromBegin(DoubleListNode node) {
		
		//first move backward until reach null
		while(node.prev!=null) {
			node=node.prev;
		}
		
		//print now
		while(node!=null) {
			System.out.print(node.val+"->");
			node=node.next;
		}
	}
	
	public void printFromEnd(DoubleListNode node) {
		
		//move forward
		while(node.next!=null) {
			node=node.next;
		}
		
		//print reverse
		while(node!=null) {
			System.out.print(node.val+"->");
			node=node.prev;
		}
	}
	
	public static void main(String args[]) {
		//creating double list nodes
				DoubleListNode l1=new DoubleListNode(3);
				DoubleListNode l2=new DoubleListNode(7);
				DoubleListNode l3=new DoubleListNode(5);
				DoubleListNode l4=new DoubleListNode(1);
				
				//linking nodes
				l1.next=l2;
				l2.prev=l1;
				
				l2.next=l3;
				l3.prev=l2;
				
				l3.next=l4;
				l4.prev=l3;
				
				DoubleListTraverse dtc=new DoubleListTraverse();
				dtc.printFromBegin(l2);
				System.out.println();
				dtc.printFromEnd(l3);
	}

}


//from l2 node onwards it starts traversing i.e l2  node reaches l1 node and then it reaches null. From there
//onwards it starts printing from beginning.
//
//from l3 node onwards it starts traversing from l3 ->l4 node and then reaches null. from there onwards it 
//starts printing from last node onwards.
