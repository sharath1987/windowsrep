import java.util.Scanner;
class multi
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n=10,p=1;
		
		
		for(int i=1;i<=10;i++)
		{
			p=n*i;
			System.out.println(n + "X" + i + "=" + p);
		}
	}
}
