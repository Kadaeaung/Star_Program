import java.util.Scanner;

public class Star_Program8 
{

	public static void main(String args[]) {
		Scanner put = new Scanner(System.in);
		System.out.println("Enter number");

		int num = put.nextInt();

		for (int i = 0; i < num; i++) 
		{
			for(int s=0;num>=i+s;s++)
            { 
				
            	System.out.print(" ");
            }
			
			for (int j = 0; j <= i; j++) {

                if(i==j)
                {
                	System.out.print("*");
                }
				

			}

			System.out.println();
		}
		 put.close();
	}

	
}
