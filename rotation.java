import java.util.Scanner;

public class rotation {

	 Node head;
     static class Node{
    	 int data;
    	 Node next;
    	 Node(int d){
    		 data=d;
    		 next=null;
    	 }
     }
     public static rotation insert(rotation li,int data) {
    	 Node newnode=new Node(data);
    	 newnode.next=null;
    	 int count=0;
    	 if(li.head==null)
    	 {
    		 li.head=newnode;
    	 }
    	 else
    	 {
    		 Node last=li.head;
    		 while(last.next!=null)
    		 {
    			 last=last.next;
    		 }
    		 last.next=newnode;
    	 }
    	 return li;
     }
     public static  rotation rotation1(rotation li,int pos,int n)
     {
    	 if(pos<n)
    	 {
    	 int count=-1;
    	 Node current=li.head;
    	 Node last=li.head;
    	 Node prev=current;
    	 while(current!=null)
    	 {
    		 count++;
    		 if(count==pos)
    		 {
    			 li.head=current;
    		 }
    		 prev=current;
    		 current=current.next;
    	 }
    	 prev.next=last;
    	 Node current1=li.head.next;
         while(current1.next!=li.head)
         {
        	 current1=current1.next;
         }
         current1.next=null;
    	 }
    	 return li;
     }
     public static void display(rotation l1)
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
				
				rotation l1=new rotation();
				Scanner in=new Scanner(System.in);
				   int n=in.nextInt();
				   int k=in.nextInt();
		           int arr[]=new int[n];
		           for(int i=0;i<n;i++)
		           {
		        	   arr[i]=in.nextInt();
		        	   insert(l1,arr[i]);
		           }
		           rotation1(l1,k,n);
		           display(l1);
			}




}
