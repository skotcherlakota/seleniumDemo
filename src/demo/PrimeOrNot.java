package demo;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long num=123456789;
		long rev = 0;

		//boolean isprime=true;

		for(int i=2;i<num;i++)
		{	
			while(num!=0)
			{


				rev=num % 10;
				num=num/10;


				System.out.println(rev);

				if(rev>2) {
					boolean flag=true;
					for(int temp=2;temp<rev;temp++) {
						if(rev%temp==0) {
							flag=false;
						}
					}

					if(flag)
					{

						System.out.println(rev + "is prime number");
					}
					else
					{
						System.out.println(rev + "is not a prime");
					}

				}
				else {
					System.out.println(rev+" is a prime");
				}




			}
		}
	}
}