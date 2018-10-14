import java.util.Scanner;
class If2
{
	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a,b;
		a=kb.nextInt();
		b=kb.nextInt();
		if (a>b)
			System.out.println(a+" is greater ");
		else if (b>a)
			System.out.println(b+" is greater ");
		else 
			System.out.println(a+" and "+b+" are equal ");		
	}
}