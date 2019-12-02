import java.util.*;
public class Chocolateproblem {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		int m=in.nextInt();
		Arrays.sort(arr);
        int mindiff=arr[m-1]-arr[0];
        System.out.print(mindiff);
	}

}
