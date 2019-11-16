import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		String str=in.next();
		String str1="";
		int n=str.length();
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<=n;j++)
			{
			String s=str.substring(i,j);
	        	System.out.println(s);
	        	char a[]=s.toCharArray();
	        	int n=0,l=a.length-1;
	        	while(n<l)
	        	{
	        		char temp=a[n];
	        		a[n]=a[l];
	        		a[l]=temp;
	        		n++;
	        		l--;
	        	}
	        	String rev=new String(a);
	        	if(s.compareTo(rev)==0 && (s.length()>long_str.length()))
	        	{
	        		str1=s;
	        	}
			}
		}        
        System.out.println("Longest Palindrome Substring : "+str1);
	}
}