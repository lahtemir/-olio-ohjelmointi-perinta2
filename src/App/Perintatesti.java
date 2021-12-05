package App;

import java.util.Scanner;

import Data.Kulkuneuvo;
import Data.Mopo;

public class Perintatesti {

	public static void main(String[] args) {
		Mopo m = new Mopo();
		moponNopeudenMuutos(m);
	}

	private static void moponNopeudenMuutos(Mopo m) {
		
		
		Scanner sc = new Scanner(System.in);
		
		boolean toisto = false;
		
		do {
		
		System.out.println("Kiihdytet‰‰nkˆ vai hidastetaanko? k/h");
		String s = sc.nextLine();
		if(s.equals("k")) {
			System.out.println("Kuinka paljon kiihdytet‰‰n?");
			String k = sc.nextLine();
			int k2 = Integer.parseInt(k);
			m.kiihdyta(k2);
			
			System.out.println("Nopeus nyt: "+ m.getNopeus());
			
			
		
		} else if (s.equals("h")) {
			System.out.println("Kuinka paljon hidastetaan?");
			String h = sc.nextLine();
			int h2 = Integer.parseInt(h);
			m.hidasta(h2);
			
			System.out.println("Nopeus nyt: "+ m.getNopeus());
		} else {
			System.out.println("V‰‰r‰ arvo");
		}
		
		System.out.println("Toistetaanko? k/e");
		String t = sc.nextLine();
		
		if (t.equals("k")) {
			toisto = true;
		} else if (t.equals("e")) {
			toisto = false;
		} else {
			System.out.println("V‰‰r‰ arvo!");
		}
		
		} while (toisto);
	}

}
