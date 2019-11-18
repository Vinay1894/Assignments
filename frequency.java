import java.util.*;
public class frquencies {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
		 arr[i]=in.nextInt();
		}
		int count;
		for(int i=0;i<arr.length;i++)
		{
		
			if(arr[i]>=0)
			{
				count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]>=0&&arr[i]==arr[j])
				{
					count++;
					arr[j]=-1;
				}
				
			}
			System.out.println(arr[i]+" "+count);
			}
		}

	}

}
