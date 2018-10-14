import java.util.Scanner;
class IF5{
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter your salary");
		int sal = obj.nextInt();
		if(sal>=10000){
			int a = (sal*10)/100;
			sal = sal+a;
		}
		else{
			int a = (sal*5)/100;
			sal = sal+a;
		}
		System.out.println(sal);
	}
}
