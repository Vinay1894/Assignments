import java.util.Scanner;
public class adjacentduplicacyremove {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		String str=in.next();
		String str1="";
		int count=0;
		for(int i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i)!=str.charAt(i+1))
			{
				if(count==0)
				{
				System.out.print(str.charAt(i));
				
				}
				else
				{
					count=0;
				}
			}
			if(str.charAt(i)==str.charAt(i+1))
			{
				count=1;
			}
		}
		if(str.charAt(str.length()-2)!=str.charAt(str.length()-1))
		{
			System.out.print(str.charAt(str.length()-1));
		}
	}

}
