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

	}

	public static int findIngredient(String[] ingredients, String ingredientName) {

		return 0;
	}

	public static boolean isRegularCustomer(String[] phoneNumbers, String phone) {

		return false;
	}

}
