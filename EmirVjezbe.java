import java.util.Scanner;

public class EmirVjezbe {

	public static int brojMax(int[] niz) {

		int max = niz[0];
		for (int idx = 1; idx < niz.length; idx++) {
			int trenutni = niz[idx];
			if (trenutni > max) {
				max = trenutni;
			}

		}

		return max;
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 13, 5, 7, 51, 57, 111, 12528, 14584, 14551 };
		System.out.println(brojMax(arr));

	}

}
