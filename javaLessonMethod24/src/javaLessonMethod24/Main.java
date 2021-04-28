package javaLessonMethod24;

/**
 * @author User
 *default run: main, The entire project is branched from the tree. calling
	 function - You must write the name method. You don't repeat yourself by
	 writing a function! There are methods in the class. Method names in java are
	 written as camelCasing. Class names in java are written PascalCasing.
	 camelCasing : example. findNumbers Follow the messages from the central
	 location! A variable is valid in the block in which it was defined. Using
	 Parameters: v1: Methods defined outside the block are sent as parameters.
	 sayiBulmaca(); // first page 
	 sayiBulmaca(); // second page 
	 sayiBulmaca(); third page
 */
public class Main {

	public static void main(String[] args) {
		sayiBulmaca(); // first page
		
	}
	// FUNCTION
	public static void sayiBulmaca() {
		// FIND THE NUMBER - SAYI BULMA//
		// number arrays
		int[] findNumbers = new int[] { 1, 2, 5, 7, 9, 0 };
		int search = 7;
		boolean isThere = false; // Thinking there is no number.

		for (int findNumber : findNumbers) { // camelCasing
			if (findNumber == search) {
				isThere = true;
				break;
			}

		}

		// v1. METHOD WITHOUT PARAMETERS//
		// v1. two messages: System.out.println("");
		if (isThere) {
			System.out.println("v1: sysout - method without parameters: Sayi mevcuttur: " + search);
		} else {
			System.out.println("v1: sysout - method without parameters: Sayi mevcut değildir: " + search);
		}

		// v2. PARAMETERS METHOD//
		// System.out.println("Sayi mevcuttur: " + search);
		// To work dynamically, the "expression to search" must be given.
		String mesaj = "";
		if (isThere) {
			mesaj = "Sayı mevcuttur" + search;
			giveMessage("v2: giveMessage() - parameters method: Sayi mevcuttur: " + mesaj);
			// giveMessage(search); (x)
		} else {
			giveMessage("v2: giveMessage() - parameters method: Sayi mevcut değildir: " + mesaj);
		}
	}

	// v2. PARAMETERS METHOD - TYPE: INT//
	// v2. Parameter Method: Giving Message!, Giving a message from the central
	// point.
	public static void giveMessage(String messages) {
		System.out.println("v2: Sayi mevcuttur: " + messages);

	}
}
