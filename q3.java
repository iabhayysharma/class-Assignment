import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int arr[]=new int[5];
	    for(int i=0;i<5;i++)
		{
		    arr[i]=sc.nextInt();
		}
		int n=arr.length;
		
     int k=sc.nextInt();
      n=n-k+1;
      int x=n*(n+1)/2;
     System.out.println(x);
	}
}

