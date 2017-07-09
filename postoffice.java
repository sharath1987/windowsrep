import java.util.Scanner;

class postoffice{
	public static void main(String[] args)
	{
		double n=0, a=1000, t=0;
		for (int i=0; i<113; i++)
		{
			t=a;
			n=(a*7.6)/100;
			a=n+t+1000;
		}
	System.out.println(a-1000);
	}
}
