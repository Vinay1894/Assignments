import java.util.*;
public class reverselist {

		Node head;
		static class Node{
			int data;
			Node prev;
			Node next;
			Node(int d)
			{
				data=d;
			}
		}
		
	    public static reverselist insert(reverselist li,int data) {
	   	 Node newnode=new Node(data);
	   	 newnode.next=null;
	   	 if(li.head==null)
	   	 {
	   		 li.head=newnode;
	   		 newnode.prev=null;
	   		 newnode.next=null;
	   	 }
	   	 else
	   	 {
	   		 Node last=li.head;
	   		 while(last.next!=null)
	   		 {
	   			 last=last.next;
	   		 }
	   		 last.next=newnode;
	   		 newnode.prev=last;
	   		 newnode.next=null;
	   	 }
	   	 return li;
	    }
	    public static void display(reverselist l1)
	    {
	   	 Node current=l1.head;
	   	 System.out.println("The LinkedList is as follows: ");
	   	 while(current.next!=null)
	   	 {
	   		 current=current.next;
	   	 }
	   	 while(current.prev!=null)
	   	 {
	   		 System.out.println(current.data);
	   		 current=current.prev;
	   	 }
	   	 System.out.println(current.data);
	    }
	    public static void main(String args[])
	    {
	    	reverselist l1=new reverselist();
	    	Scanner in= new Scanner(System.in);
	    	int n=in.nextInt();
	    	int arr[]=new int[n];
	    	for(int i=0;i<n;i++)
	    	{
	    		arr[i]=in.nextInt();
	    		insert(l1,arr[i]);
	    	}
	    	display(l1);
	    }

	}
