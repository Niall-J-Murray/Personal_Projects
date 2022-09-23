import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingListRunner {
	private static Scanner scanner = new Scanner(System.in);
	private static ShoppingList shoppingList = new ShoppingList();

	public static void main(String[] args) {
		boolean quit = false;
		int selection = 0;
		// printInstructions(); // Prints when code is run. Changed to print after every
		// change is made.
		// Consider removing print instructions case.
		while (!quit) {
			printInstructions();
			System.out.println("Enter Selection: ");
			selection = scanner.nextInt();
			scanner.nextLine();

			switch (selection) {
			case 1:
				printInstructions();
				break;
			case 2:
				printList();
				break;
			case 3:
				findItem();
				break;
			case 4:
				addItem();
				break;
			case 5:
				removeItem();
				break;
			case 6:
				replaceItem();
				break;
			case 7:
				processArrayList();
			case 0:
				System.out.println("Exiting app...");
				quit = true;
				break;
			}
		}

	}

	private static void printInstructions() {
		System.out.println("\nPlease Type: ");
		System.out.println("1- To show options.\t 2- To show list.\t 3- To search for item.");
		System.out.println("4- To add item.\t     5- To remove item.\t 6- To replace item.");
		System.out.println("0- To quit app.");
	}

	private static void printList() {
		shoppingList.printList();
	}

	private static void findItem() {
		System.out.print("Enter item to search for: ");
		String searchItem = scanner.nextLine();
		if (shoppingList.onList(searchItem)) {
			System.out.println("Found " + searchItem + " on shopping list.");
		} else {
			System.out.println(searchItem + " is not found on shopping list. ");
		}
	}

	private static void addItem() {
		System.out.print("Enter item to add to list:");
		shoppingList.addItem(scanner.nextLine());
	}

	private static void removeItem() {
		printList();
		System.out.print("Enter item to be removed: ");
		String item = scanner.nextLine();
		scanner.nextLine();
		shoppingList.removeItem(item);
	}

	private static void replaceItem() {
		printList();
		System.out.print("Enter item to be replaced: ");
		String item = scanner.nextLine();
		scanner.nextLine();
		System.out.print("Enter replacement item: ");
		String newItem = scanner.nextLine();
		shoppingList.replaceItem(item, newItem);
	}

	private static void processArrayList() {
//        ArrayList<String> arrayList = new ArrayList<String>();
//        arrayList.addAll(shoppingList.getShoppingList());
		// Same as above, more concise.
		@SuppressWarnings("unused")
		ArrayList<String> arrayList = new ArrayList<>(shoppingList.getShoppingList());
		// Converting ArrayList to Array.
		String[] myArray = new String[shoppingList.getShoppingList().size()];
		shoppingList.getShoppingList().toArray(myArray);
	}

}
