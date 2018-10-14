import java.util.Scanner;
class Divisible
{
	public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);
	int varx;
	System.out.println("enter the Integer");
	varx=obj.nextInt();
	if (varx %2==0 && varx %4==0) {
		System.out.println("2 aur 4 se Divisible hai");

	}
	else {
		System.out.println("2 se Divisible nahi hai");

	}

	}
}