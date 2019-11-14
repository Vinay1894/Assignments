package practise;
import java.util.*;
public class subarray2 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
		   arr[i]=in.nextInt();
		}
		int count=0;
	     int sum=in.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			count=arr[i];
			if(arr[i]==sum)
			{
				System.out.println("Starting index: "+i+" Ending index: "+i);
			}
			else
			{
				for(int j=i+1;j<arr.length;j++)
				{
					count=count+arr[j];
					if(count==sum)
					{
						System.out.println("Starting index: "+i+" Ending index: "+j);
					}
				}
			}
			count=0;
		}

	}

}
