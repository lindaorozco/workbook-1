import java.util.Scanner;

public class FridayExer1 {
    public static void main(String[] args) {
//         Say hello
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Hello, please enter your name ");
//        String name = scanner.nextLine();
//        System.out.println(" Hello " + name + " Welcome to the game.");
//
//         age in dog years
//        System.out.println("Please enter your age");
//        int age = scanner.nextInt();
//        System.out.println(" In dog years you are " + age * 7);
//
//         dice roll
//        int randomDiceRoll = (int)(Math.random()* 6)+1;
//        System.out.println("Dice Roll :" + randomDiceRoll);
//
//        // Hero stats
        System.out.println("What is your name?");
        String name1 = scanner.nextLine();
        System.out.println("What is your strength ? 0-10? ");
        int strength = scanner.nextInt();
        System.out.println("What is your agility?");
        int agility = scanner.nextInt();
        System.out.println("Name:" + name1 + "Strength "+ strength + "Agility" + agility);
//
//        // Level up!'
        System.out.println( "What is your current level? ");
        int currentLevel = scanner.nextInt();
        int newLevel = currentLevel + 1;
        System.out.println("You leveled up! " + newLevel);

        // coin calculator
        System.out.println();



    }
}
