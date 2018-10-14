import java.util.Scanner;
class example4
{
	public static void main(String[] args) {
		
		Scanner kb =new Scanner(System.in);
		System.out.println("please enter your name:");
		String a =kb.next();
		System.out.println("please enter you age:");
		int b=kb.nextInt();
		System.out.println(" my name is "+a+" and my age is "+b);
	}
}
