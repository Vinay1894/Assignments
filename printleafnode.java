import java.util.*;
public class leafnode {
	static class Node
	{
		int key;
		Node left,right;
		public Node(int data)
		{
			key=data;
			left=right=null;
		}
	}
	static Node root;
	public static void insert1(int key)
	{
		root=insert(root,key);
	}
	public static Node insert(Node root,int key)
	{
		if(root==null)
		{
			root= new Node(key);
			return root;
		}
		else if(root.key>key)
		{
			root.left=insert(root.left,key);
		}
		else if(root.key<key)
		{
			root.right=insert(root.right,key);
				
		}
	   return root;
	}
    public static void printleafnode(Node r)
    {
    	if(r!=null)
    	{
    		printleafnode(r.left);
    		if(r.left==null&r.right==null)
    		{
    		System.out.print(r.key+" ");
    		}
    		printleafnode(r.right);
    	}
    	return;
    }
    public static void main(String[] args) {
	    bst bt =new bst();
	    insert1(100);
	    insert1(50);
	    insert1(150);
	    insert1(40);
	    insert1(60);
	    insert1(55);
	    insert1(65);
	    insert1(62);
	    insert1(70);
	    insert1(68);
	    insert1(75);
	    insert1(66);
	    insert1(69);
	    printleafnode(root);
	}



}
