import java.util.Scanner;

public class Star_Program6 {
	public static void main(String[]args)
	 {
		 Scanner put = new Scanner(System.in);
			System.out.println("Enter row");

			int num = put.nextInt();

			for (int i = 0; i <=num; i++) 
			{
//				for(int s=0; s<num-i;s++)
//	            { 
//					
//	            	System.out.print(" ");
//	            }
				
				for (int j = 0; j < i; j++) {

	                
					System.out.print(" *");

				}
				
				
				

				System.out.println();
			}
			
			;
			for (int i = num; i > 0; i--) 
			{
				
//				for(int s=0; s<num-i;s++)
//	            { 
//					
//	            	System.out.print(" ");
//	            }
				
				for (int j = 1; j < i; j++) {

	                
					System.out.print(" *");

				}
				
				
				

				System.out.println();
			}
			 put.close();
	 }


}
