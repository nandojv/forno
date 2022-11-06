package corsoiniziodacapo;

public class forno {

	public String cottura;
	public String  programma;
	public int temperatura;
	public int tempo;
	
	public forno () {
	}
		
	public void scegliprogramma(int scelta) {
	
	if (scelta==1) {
System.out.println("ventilato");}
	
	else if(scelta==2) {
		System.out.println("temperatura 180°");}
	
		
	}
	
	public void sceglitemperatur(int scelta) {
		
		if (scelta==1) {
	System.out.println("vapore");}
		
		else if(scelta==2) {
			System.out.println("temperatura 90°");}
		
			
		}
	public void sceglitempo(int scelta) {
		
		if (scelta==1) {
	System.out.println("1 ora");}
		
		else if(scelta==2) {
			System.out.println("40 minuti°");}
		
			
		}
		
}
