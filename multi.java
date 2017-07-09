import java.util.Scanner;
class multi
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n,p=1;
		System.out.println("enter the number for which you want to print the table: ");
		n = in.nextInt();
		for(int i=1;i<=10;i++)
		{
			
			System.out.println(n + "X" + i + "=" + n*i);
		}
	}
}
