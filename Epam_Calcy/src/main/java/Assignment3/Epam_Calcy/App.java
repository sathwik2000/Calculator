package Assignment3.Epam_Calcy;

import java.util.*;
public class App
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Addition\n2.Subtraction\n3.Multipication\n4.Division\n5.Power(a^b)\n");
		System.out.println("Enter the operation number which you want to perform: ");
		int n=sc.nextInt();
		System.out.println("Enter two operands: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int x=0;
		switch(n)
		{
			case 1:
				x=a+b;
				System.out.println("Addition: "+x);
				break;
			case 2:
				x=a-b;
				System.out.println("Subtraction: "+x);
				break;
			case 3:
				x=a*b;
				System.out.println("Multiplicationis: "+x);
				break;
			case 4:
				if(b==0)
				{
					System.out.println("Enter a valid number");
				}
				else
				{
					x=a/b;
					System.out.println("Division: "+x);
				}
				break;
			case 5:
				x=(int) Math.pow(a,b);
				System.out.println("power of two numbers is: "+x);
				break;
			default :
				System.out.println("Enter valid number");
				System.exit(0);
		}
	}
}