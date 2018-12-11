import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		// Uneti ceo broj n - broj utakmica.
		// Za n unetih celih brojeva uneti brojeve koji predstavljaju
		// broj datih poena nekog igraca na svakoj od n utakmica.
		// Ako se zna da je na svakoj na kojoj je igrao postigao bar 1 poen
		// izracunati prosecan broj poena na odigranim utakmicama

		/*
		 * System.out.println("Uneti broj utakmica tima."); Scanner input = new
		 * Scanner(System.in);
		 * 
		 * int brUtakmica = input.nextInt(); int brOdigranihUt = brUtakmica; int
		 * ukupniPoeni = 0;
		 * 
		 * for (int i = 0; i < brUtakmica; i++) {
		 * System.out.println("Unesite broj poena koji je igrac postigao na utakmici " +
		 * (i + 1) + "."); int poeniUtakmica = input.nextInt(); if (poeniUtakmica <= 0)
		 * { brOdigranihUt--; } ukupniPoeni += poeniUtakmica; }
		 * 
		 * double prosek = (double) ukupniPoeni / brOdigranihUt;
		 * 
		 * if (brOdigranihUt == 0) {
		 * System.out.println("Igrac nije igrao nijednu utakmicu."); } else {
		 * System.out.println("Prosecan broj poena po odigranoj utakmici je " + prosek +
		 * "."); } input.close(); }
		 */

		// prosti brojevi

		System.out.println("Uneti ceo broj.");

		Scanner input = new Scanner(System.in);
		int broj = input.nextInt();
		input.close();
		
		boolean b = true;
		
		for (int i = 2; i <= (broj / 2) && b == true; i++) {
			if (broj % i == 0) {
				b = false;
//				System.out.println("Delilac je " + i + ".");
			}
		}
		
		if (b == true) {
			System.out.println("Broj je prost.");
		} else {
			System.out.println("Broj je slozen.");
		}
		
	}
}
