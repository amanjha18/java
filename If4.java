import java.util.Scanner;

class If4 {
	public static void main(String[] args) {
		Scanner variable = new Scanner(System.in);
		System.out.println("enter a name");
		String name = variable.next();
		int names = name.length();

		if (names <= 5){
			System.out.println("naam chota hai");
		}else{
			System.out.println("naam kafi bada hai");
		}
	}
}