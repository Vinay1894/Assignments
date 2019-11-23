import java.util.*;
public class arraymax {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		int count=0;
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
       
        for(int i=0;i<n;i++)
        {
        	
        	for(int j=i;j<n;j++)
        	{
        		int l=i;
        		int max=0;
        		while(l<=j)
        		{
        			if(arr[l]>max)
        				max=arr[l];
   	
        			l++;
        		}
        		if(max>k)
            		count++;
        	}
        	
        }
        System.out.print(count);

	}

}
