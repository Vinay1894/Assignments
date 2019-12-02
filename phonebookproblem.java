
import java.util.Scanner;
public class phonebookproblem {
	Node head;
	static class Node{
		int data;
		String st;
		Node next;
		Node(int d,String s)
		{
			data=d;
			st=s;
		}
	}
	
    public static phonebookproblem insert(phonebookproblem li,int data,String s) {
   	 Node newnode=new Node(data,s);
   	 newnode.next=null;
   	 if(li.head==null)
   	 {
   		 li.head=newnode;
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
   		 newnode.next=null;
   	 }
   	 return li;
    }
    public static void display(phonebookproblem l1,String s[])
    {
   	    Node current=l1.head;
   	    while(current!=null)
   	    {
   	    	int count=0;
   	    	for(int i=0;i<s.length;i++)
   	    	{
   	    		if(current.st.equals(s[i]))
   	    		{
   	    			count=1;
   	    		}
   	    	}
   	    	if(count==1)
   	    	{
   	    		System.out.println(current.st+" "+current.data);
   	    	}
   	    	else {
   	    		System.out.println("Not Found");
   	    	}
   	    	current=current.next;
   	    }
   	    	
    }
    public static void main(String args[])
    {
    	phonebookproblem l1=new phonebookproblem();
    	Scanner in= new Scanner(System.in);
    	int n=in.nextInt();
    	int arr[]=new int[n];
    	String s1[]=new String[n];
    	for(int i=0;i<n;i++)
    	{
    		String s=in.next();
    		arr[i]=in.nextInt();
    		insert(l1,arr[i],s);
    	}
    	for(int i=0;i<n;i++)
    	{
    		s1[i]=in.next();
    	}
    	display(l1,s1);
    }


}
