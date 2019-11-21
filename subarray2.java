import java.util.*;
public class maxsubarray {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		 int ws=in.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
       
        for(int i=0;i<n-ws+1;i++)
        {
        	int max=0;
        	for(int j=i;j<i+ws;j++)
        	{
        		if(arr[j]>max)
        		{
        			max=arr[j];
        		}
        	}
        	System.out.print(max+" ");
        }
	}

}