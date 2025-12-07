package code;

//import java.util.Scanner();
import java.util.Scanner;

public class CivilizationGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("What is your civilization's name?: ");
		String name = scanner.nextLine();
		int food = 10;
		System.out.println("you have " + food + "fooooood boxes");
		int wood = 10;
		System.out.println("you have" + wood + "wood in a door box");
		int population = 5;
		System.out.print("what are you going to collect (1) Gather Food or (2) Gather Wood: ");
		int ox = 10;
		int collect = scanner.nextInt();
		if (collect == 2) {
			System.out.println("you go and find 5 wooooooood");
			wood = wood + 5;
		} else if (collect == 3) {
			if (wood >= 8) {
				wood = wood - 8;
				population = population + 1;
				System.out.println("A new shelter is built! Population grows by 1.");
			} else {
				System.out.println("Not enough wood to build a shelter.");
			}
		} else {
			System.out.println("go find fooooooooooooooooood");
			food = food + 5;
			
			
		}
		System.out.println("you have " + food + "food");
		System.out.println("you have" + wood + "wood");
		System.out.println("you have" +population + "population");
		
		
		if (food>population) {
			System.out.println("population happy happy haaappyyy.");
		}else{
			System.out.println("population the is gloomy.");
		}
		
	}

}
