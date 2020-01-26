import java.util.Scanner;

class ArmstrongNo
{
	public static void main(String[] args)
	{
		System.out.println("main method started......");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number...");
		int num=sc.nextInt();
		
		int digit=0;
		int sum=0;
		int temp=num;
		while(num>0)
		{
			digit=num%10;
			num=num/10;
			sum=sum+(digit*digit*digit*digit);
		}
		if(temp==sum)
		{
			System.out.println(temp+"\nis Armstrong no.");
		}
		else
		{
			System.out.println(temp+"\nis not Armstrong no.");
		}
		

		System.out.println("\nmain method ended......");
	}
}