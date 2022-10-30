import java.util.*;
import java.io.*;

public class Fibonacci_Pro
{	
	static int n1=0,n2=1,n3;

	public static void iterative_fun(int n)
	{
		int x=0;
		int y=1;
		if(n==0)
		{
			System.out.println("0th pos:"+x);
			return;
		}
		else if(n==1)
		{
			System.out.println("0th pos:"+x);
			System.out.println("1st pos:"+y);
			return;
		}
		else
		{	
			int z=0;
			System.out.println("0th pos:"+x);
			System.out.println("1st pos:"+y);
			for(int i=2;i<=n;i++)
			{	z=x+y;
				System.out.println(i+"th pos:"+z);
				x=y;
				y=z;	
			}
			
		}
		
		
	}
	public static void recursive_series(int n)
	{
		if(n>0)
		{
			n3=n2+n1;
			n1=n2;
			n2=n3;
			System.out.println(n3);
			recursive_series(n-1);
		}
	}
	static int fibonacciRecursive(int n) {
		
		if(n == 0) return 0;
		if(n == 1) return 1;
		
		return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
		
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("iterative method:\n\n");
		System.out.println("\nEnter the count till upto you want to generate fibonacci series start with 0 count.\n");
		int n;
		n=sc.nextInt();
		System.out.println("Answer:\n");
		iterative_fun(n);

		System.out.println("Recursive method:\n\n");
		System.out.println("\nEnter the count till upto you want to generate fibonacci series start with 0 count.\n");
		n=sc.nextInt();
		System.out.println("Answer:\n");
		if(n==0)
		{
			System.out.println("0");
		}
		else if(n==1)
		{
			System.out.println("1");
		}
		else
		{
			System.out.println("0");
			System.out.println("1");
			recursive_series(n-1);
		}
		
		
	}
}