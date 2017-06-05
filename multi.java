import java.util.Scanner;
class multi
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int p=1;
		System.out.print("Enter the number:");
		int n = in.nextInt();
		for(int i=1;i<=10;i++)
		{
			p=n*i;
			System.out.println(n + "X" + i + "=" + p);
		}
	}
}
