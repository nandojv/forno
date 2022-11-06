package corsoiniziodacapo;

import java.util.Scanner;

import java.util.Scanner;

public class rational {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int progra=0;
		int forno=0;
		int tempe=0;
		int time=0;
		
		
		do {	
			Scanner a = new Scanner(System.in);
			
			System.out.println("ventilato,vapore:1 ,2"); 
			
			  forno =a.nextInt(); 

			
			 Scanner b = new Scanner(System.in);
				
				System.out.println("scegli tempo:1 1ora ,2 40 minuti "); 
				
				   progra=b.nextInt(); 

			
				 Scanner c = new Scanner(System.in);
					
					System.out.println("scegli temperatura:1 180° ,2 100° "); 
					
					 tempe =c.nextInt(); 
	              
					 forno scelta=new forno();
	           
	              
					 System.out.println("buona cottura");
					
	              
	              
			}
		while (forno!=1+2);
		}
		}
		

	
	
	
	
	



