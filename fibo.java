import java.util.Scanner;
public class fibo

{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int a=0, b=1, c=0;
		System.out.println("enter the range of the fibonacci series to be printed");
		int n = in.nextInt();
		System.out.println("Your fibinacci series is as follows");
		System.out.print(a +" \t" +b+" \t");
		for(int i=0; i<n-2 ; i++)
		{
			c=a+b;
			System.out.print(c+"\t");
			a=b;
			b=c;
		}
	}
}
