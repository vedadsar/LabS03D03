
public class EmirVjeybe1 {

	public static int[] noviSpil(){
		int [] karte = new int [52];
		for (int i=0; i<karte.length;i++){
			karte[i] = i+1;
		
		}
		return karte;
		
		
	}
	
	public static nizUString (int niz[]){
		
		if (niz.length == 0){
			return " ";
		}
		
	}
	
	public static int randomKarta(int[] spil){
		
		
		
		return (int) (Math.random()*52);
	}
	
	public static void main(String[] args) {
	int [] spil = noviSpil();
}

	
}
