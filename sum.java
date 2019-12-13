import java.util.*;
public class sum 
{
public static void main(String arg[])
{
	Scanner in=new Scanner(System.in);
	int a=in.nextInt();
	int b=in.nextInt();
	while(a!=0)
	{
		a--;
		b++;
	}
	System.out.println(b);
}
}