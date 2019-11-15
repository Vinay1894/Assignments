import java.util.*;
public class stack {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		String str=in.next();
        Stack <String>s1=new <String>Stack();
        int count=0;
        for(int i=0;i<str.length();i++)
        {
        	if(str.charAt(i)=='['||str.charAt(i)=='('||str.charAt(i)=='{')
        	{
        	     String s="";
        	     s=s+str.charAt(i);
        	     s1.push(s);
        	}
        	else if(str.charAt(i)==']')
        	{
        		String s=s1.peek();
        		if(s.equals("["))
        		{
        		   s1.pop();
        		}
        	}
        	else if(str.charAt(i)=='}')
        	{
        		String s=s1.peek();
        		if(s.equals("{"))
        		{
        			s1.pop();
        		}
        	}
        	else if(str.charAt(i)==')')
        	{
        		String s=s1.peek();
        		if(s.equals("("))
        		{
        			s1.pop();
        		}
        	}
        }
        if(s1.isEmpty())
        {
        	System.out.print("Balanced");
        }
        else
        {
        	System.out.print("Not Balanced");
        }
	}

}
