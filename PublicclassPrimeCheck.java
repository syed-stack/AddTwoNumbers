package tenth;

import java.util.Scanner;

public class PublicclassPrimeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp;
		boolean isPrime=true;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter any number");
		int num =scan.nextInt();
		       scan.close();
		for(int i=2;i<num;i++)
		{
			temp=num%i;
			if(temp==0)
			{ 

				isPrime=false;
				break;

			}
		}
		if(isPrime)
			System.out.println(num +"is a prime number");
		else
			System.out.println(num + "is not a prime number");

	}

}
