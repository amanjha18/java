import java.util.Scanner;
public class example2
{
	public static void main(String[]args) {

		Scanner kb=new Scanner(System.in);
		System.out.println("Enter two Numbers");
		int a=kb.nextInt();
		int b=kb.nextInt();
		int s=a+b;
		System.out.println(" sum of  "+a+" and " +b+ " is "+s);
	}
}