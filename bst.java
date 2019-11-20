class Node1
	{
		int key;
		Node1 left,right;
		public Node1(int data)
		{
			key=data;
			left=right=null;
		}
	}
public class bst {
	static int count=0;
	static Node1 root;
	static int count1=0;
    public static void count(Node1 r)
    {
    	if(r!=null)
    	{
    		count++;
    		count(r.left);
    		count(r.right);
    	}
    	return;
    }
    public static void count1(Node1 r)
    {
    	if(r!=null&&r.left!=null&&r.right!=null)
    	{
    			if(r.key>r.left.key)
    			{
    				count1++;
    			}
    			if(r.key<r.right.key)
    			{
    				count1++;
    			}
    			
    				count1(r.left);
    				count1(r.right);
    			
    	       
    	}

   }
    public static void main(String args[])
    {
    
        root=new Node1(20);
        root.left=new Node1(10);
        root.right=new Node1(40);
        root.left.left=new Node1(5);
        root.left.right=new Node1(15);
        root.right.left=new Node1(30);
        root.right.right=new Node1(45);
        count(root);
        count1(root);
        if(count==count1+1)
        {
        	System.out.print("Tree is BST");
        }
        else
        {
        	System.out.print("Tree is not BST");
        }
   }
}
