import java.util.Scanner;

public class orderAndPickUp {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int[] price = { 50, 60, 120, 120, 140, 100, 100, 100, 80, 50, 80, 80, 80, 50, 50, 20 };
		String[] ingredient = { "Makarone", "Spagete", "Bolognese", "Curetina", "Govedja prsuta", "Slanina", "Piletina",
				"4 sira", "Dimljeni sir", "Parmezan", "Pavlaka", "Pesto sos", "Napolitana", "Povrce mix", "Pecurke",
				"Kutija" };
		String[] regularCustomer = { "0631111111", "063222222", "063333333", "064444444", "065555555", "066666666" };

		System.out.println("Izvolite!");
		System.out.println("Izaberite sastojak za pastu: ");
		String ingredientName = s.nextLine();
		double suma = 0;

		while (!ingredientName.equals("Poruci")) {
			findIngredient(ingredient, ingredientName);
			int x = findIngredient(ingredient, ingredientName);
			if (x >= 0) {
				suma = suma + price[findIngredient(ingredient, ingredientName)];
			}
			System.out.println("Izaberite sastojak za pastu: ");
			ingredientName = s.nextLine();
		}

		System.out.println("Unesite broj telefona: ");
		String phone = s.next();
		isRegularCustomer(regularCustomer, phone);

		if (isRegularCustomer(regularCustomer, phone) == true) {
			suma = suma - (suma * 0.1);
		}
		System.out.println("Cena Vase paste je: " + suma);
	}

	public static int findIngredient(String[] ingredients, String ingredientName) {

		for (int i = 0; i < ingredients.length; i++) {
			if (ingredientName.equals(ingredients[i])) {
				return i;
			}
		}

		return -1;
	}

	public static boolean isRegularCustomer(String[] phoneNumbers, String phone) {

		for (int i = 0; i < phoneNumbers.length; i++) {
			if (phone.equals(phoneNumbers[i])) {
				return true;
			}

		}

		return false;
	}

}
