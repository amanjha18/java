import java.util.Scanner;
class Nested1
{
	public static void main(String[] args) 
	{
		Scanner obj=new Scanner(System.in);
		int a,b,c;
		System.out.println(" enter first numnber ");
		a=obj.nextInt();
		System.out.println(" enter second numnber ");
		b=obj.nextInt();
		System.out.println(" enter the third number ");
		c=obj.nextInt();
		if (a>b) {
			if(a>c)
			{
			System.out.println(" greater value is "+a);
			}
			else
			{
				System.out.println(" greater value is "+c);

			}
		}
		else
		{
			if(b>c)
			{
			System.out.println(" greater value is "+b);
			}
			else
			{
				System.out.println(" greater value is "+c);
				}	
		}


	}
	
}