import java.util.*;
public class string {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.next();
		char a[]=str.toCharArray();
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>=65&&a[i]<=90 || a[i]>=97&&a[i]<=122)
			{
				count++;
			}
		}
        char a1[]=new char[count];
        char a2[]=new char[str.length()];
        int l=0;
        for(int i=0;i<a.length;i++)
		{
			if(a[i]>=65&&a[i]<=90 || a[i]>=97&&a[i]<=122)
			{
				a1[l]=a[i];
				l++;
			}
			else
			{
				a2[i]=a[i];
			}
		}
        int j=a1.length-1;
        for(int i=0;i<a2.length;i++)
        {
        	if(a2[i]=='\0')
        	{
        		a2[i]=a1[j];
        		j--;
        	}
        }
        for(int i=0;i<a2.length;i++)
        {
        	System.out.print(a2[i]);
        }
	}

}
