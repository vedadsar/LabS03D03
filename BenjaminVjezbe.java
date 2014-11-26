public class BenjaminVjezbe {

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

	public static void main(String[] args) {

		System.out.println("Unesite broj clanova niza");
		int broj = TextIO.getInt();
		int[] noviNiz = printNiz(unosNiza(broj));
		int suma = 0;
		for (int i = 0; i < noviNiz.length; i++) {
			suma = suma + noviNiz[i];

		}
		System.out.println("Suma svih clanova niza je " + suma);
	}

}
