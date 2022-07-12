import java.util.Scanner;

public class Star_Program10 {
	public static void main(String args[]) {
		Scanner put = new Scanner(System.in);
		System.out.println("Enter number");

		int num = put.nextInt();
		
		for (int i = 0; i < num; i++) 
		{
			if(i!=num/2)
            {
				
				

            
            	for(int k=0 ;k<num/2 ;k++)
            	{
            		System.out.print("  ");
            	}
			
            
            }

			
			if(i!=num/2)
			{
				System.out.print("* ");
			}
			for (int j = 0; num>j;j++) {

				
				
               
                if(i==num/2)
                {
                
                	System.out.print("* ");
                
                }
                
				
                

			}

			System.out.println();
		}
		 put.close();
	}


}
