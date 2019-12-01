import java.util.*;
public class pallingdrom {

	 Node head;
     static class Node{
    	 int data;
    	 Node next;
    	 Node(int d){
    		 data=d;
    		 next=null;
    	 }
     }
     public static 	pallingdrom insert(	pallingdrom li,int data) {
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
     public static void checkpallingdrom(pallingdrom l1,int n)
     {
    	 Node current=l1.head;
    	 int count=n-1;
    	 int count1=0;
    	 int rev=0;
    	 int number=0;
    	 while(current!=null)
    	 {
    		 rev=(int)(rev+current.data*Math.pow(10,count1));
    		 number=(int)(number+current.data*Math.pow(10,count));
    		 count--;
    		 count1++;
    		 current=current.next;
    	 }
    	 if(rev==number)
    	 {
    		 System.out.print("Pallingdrom");
    	 }
    	 else {
    		 System.out.print("Not Pallingdrom");
    	 }
     }
    
			public static void main(String[] args) {
				
				pallingdrom l1=new 	pallingdrom();
				Scanner in=new Scanner(System.in);
				   int n=in.nextInt();
		           int arr[]=new int[n];
		           for(int i=0;i<n;i++)
		           {
		        	   arr[i]=in.nextInt();
		        	   insert(l1,arr[i]);
		           }
		           checkpallingdrom(l1,n);
			}

}
