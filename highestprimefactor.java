import java.util.*;
public class highestprimefact {
	
  public static void main(String args[])
  {
	  Scanner in =new Scanner(System.in);
	  int n=in.nextInt();
	  int j=2,maxfact=0;
	  while(n!=0)
	  {
		  if(n%j!=0)
		  {
			  j=j+1;
		  }
		  else {
			  maxfact=n;
			  n=n/j;
			  if(n==1)
			  {
				  System.out.print(maxfact);
				  break;
			  }
		  }
	  }
  }
}
