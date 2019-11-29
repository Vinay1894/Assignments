import java.util.Scanner;

public class sumlist {

	 Node head;
     static class Node{
    	 int data;
    	 Node next;
    	 Node(int d){
    		 data=d;
    		 next=null;
    	 }
     }
     public static sumlist insert(sumlist li,int data) {
    	 Node newnode=new Node(data);
    	 newnode.next=null;
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
     public static int sum(sumlist l1,sumlist l2)
     {
    	 int count=0;
    	 int count1=0;
    	 int sum1=0;
    	 int sum2=0;
    	 int total=0;
    	 Node current=l1.head;
    	 Node current1=l2.head;
    	 while(current!=null)
    	 {
    		 sum1=(int)(sum1+current.data*Math.pow(10,count));
    		 count++;
    		 current=current.next;
    	 }
    	 while(current1!=null)
    	 {
    		 sum2=(int)(sum2+current1.data*Math.pow(10,count1));
    		 count1++;
    		 current1=current1.next;
    	 }
    	 total=sum1+sum2;
    	 return total;
     }
    public static void display(sumlist l3)
    {
    	Node current=l3.head;
    	while(current!=null)
    	{
    		System.out.print(current.data+" ");
    		current=current.next;
    	}
    	System.out.println();
    }
			public static void main(String[] args) {
				
				sumlist l1=new sumlist();
				sumlist l2=new sumlist();
				sumlist l3=new sumlist();
				Scanner in=new Scanner(System.in);
				   int n=in.nextInt();
		           int arr[]=new int[n];
		           for(int i=0;i<n;i++)
		           {
		        	   arr[i]=in.nextInt();
		        	   insert(l1,arr[i]);
		           }
		           int n1=in.nextInt();
		           int arr1[]=new int[n1];
		           for(int i=0;i<n1;i++)
		           {
		        	   arr1[i]=in.nextInt();
		        	   insert(l2,arr1[i]);
		           }
		           int c=sum(l1,l2);
		           int d=c;
		           while(d!=0)
		           {
		        	   int b=d%10;
		        	   insert(l3,b);
		        	   d=d/10;
		           }
		           display(l3);
		           System.out.print(c);
			}


}
