package intro;

public class Main {

	public static void main(String[] args) {

		int counter = 0;
		int toplam1 = 0, toplam2 = 0, sayi1 = 2, sayi2 = 1;

		while (counter != 2) {
			toplam1 = 0;
			for (int j = 1; j < sayi1; j++) {
				if (sayi1 % j == 0) {
					toplam1 += j;
				}
			}
			sayi2 = 0;
			while (sayi2 < sayi1) {
				toplam2 = 0;
				for (int j = 1; j < sayi2; j++) {
					if (sayi2 % j == 0) {
						toplam2 += j;
					}
				}
				if (sayi1 == toplam2 && sayi2 == toplam1) {
					System.out.println(sayi1 + "  " + sayi2);
					counter++;
				}
				sayi2++;
			}
			sayi1++;
		}
	}

}
