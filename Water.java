import java.util.Scanner;
class Water
{
	public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);
	int a;
	System.out.println("enter the amount of Water");
	a=obj.nextInt();
	
	if (a<1){
		System.out.println("aur paani bharna hai");
	}
	else if (a > 1 && a < 10){
		System.out.println("aur nahi bharna");
	}
	else if (a > 10){
		System.out.println("overflow");
	}


	}
}