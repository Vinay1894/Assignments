import java.util.*;

public class removeduplicacy {

			 Node head;
		     static class Node{
		    	 int data;
		    	 Node next;
		    	 Node(int d){
		    		 data=d;
		    		 next=null;
		    	 }
		     }
		     public static removeduplicacy insert(removeduplicacy li,int data) {
		    	 Node newnode=new Node(data);
		    	 newnode.next=null;
		    	 int count=0;
		    	 if(li.head==null)
		    	 {
		    		 li.head=newnode;
		    	 }
		    	 else
		    	 {
		    		 Node current=li.head;
		    		 while(current!=null)
		    		 {
		    			 if(current.data==data)
		    			 {
		    				 count=1;
		    			 }
		    			 current=current.next;
		    		 }
		    		 if(count==0)
		    		 {
		    		 Node last=li.head;
		    		 while(last.next!=null)
		    		 {
		    			 last=last.next;
		    		 }
		    		 last.next=newnode;
		    		 }
		    	 }
		    	 return li;
		     }
		     public static void display(removeduplicacy l1)
		     {
		    	 Node current=l1.head;
		    	 System.out.println("The LinkedList is as follows: ");
		    	 while(current.next!=null)
		    	 {
		    		 System.out.println(current.data);
		    		 current=current.next;
		    	 }
		    	 System.out.println(current.data);
		     }
		    
					public static void main(String[] args) {
						
						removeduplicacy l1=new removeduplicacy();
						Scanner in=new Scanner(System.in);
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
