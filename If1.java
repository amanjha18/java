import java.util.Scanner;
public class If1
{
	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		int Sal,b;
		System.out.println("enter your Salary");
		Sal=obj.nextInt();
		if (Sal>=10000);
			b=(Sal*10)/100;
			Sal=Sal+b;
			System.out.println("salary is" + Sal);
			
		
	}
}