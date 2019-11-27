import java.util.*;
public class arraypairssum {
	
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int n1=in.nextInt();
		int sum=in.nextInt();
		int arr[]=new int[n];
		int arr1[]=new int[n1];
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		for(int i=0;i<n1;i++)
		{
			arr1[i]=in.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n1;j++)
			{
				if(arr[j]!=-444 && arr[i]+arr1[j]==sum)
				{
					System.out.println(arr[i]+" "+arr1[j]);
					arr[j]=-444;
				}
			}
		}
	}

}
