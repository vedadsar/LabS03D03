public class VjezbeNiz {

	public static int[] unosNiza(int brojNiza) {

		int[] unosNiz = new int[brojNiza];

		for (int i = 0; i < unosNiz.length; i++) {
			System.out.println("Unesite " + (i + 1) + " broj");
			unosNiz[i] = TextIO.getInt();

		}
		return unosNiz;
	}

	public static int[] printNiz(int[] nekiNiz) {

		for (int i = 0; i < nekiNiz.length; i++) {
			System.out.print(nekiNiz[i] + " ");
			
		}
		System.out.println();
		return nekiNiz;
	}

	public static int suma( int [] niz){
		
		int suma = 0;
		for (int i = 0; i < niz.length; i++) {
			suma = suma + niz[i];
		
		}
		return suma;
	}
	
	public static int min(int [] niz){
		
		int najmanji = niz[0];
		
		for ( int i = 1; i<niz.length;i++){
			if(niz[i]<najmanji){
				najmanji=niz[i];
			}
		}
		
		return najmanji;
	}
	
public static int max(int [] niz){
		
		int najveci = niz[0];
		
		for ( int i = 1; i<niz.length;i++){
			if(niz[i]>najveci){
				najveci=niz[i];
			}
		}
		
		return najveci;
	}
		
	
	public static void main(String[] args) {

		System.out.println("Unesite broj clanova niza");
		int broj = TextIO.getInt();
	    int [] noviNiz= printNiz(unosNiza(broj));

		
		System.out.println("Suma svih clanova niza je " + suma(noviNiz) +", a najmanji clan niza je " +min(noviNiz) +", a najveci clan niza je " +max(noviNiz));
	}

}
