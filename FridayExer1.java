

import java.util.Scanner;

public class FridayExer1 {
    public static void main(String[] args) {
//         Say hello
        Scanner scanner = new Scanner(System.in);
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
////        // Hero stats
//        System.out.println("What is your name?");
//        String name1 = scanner.nextLine();
//        System.out.println("What is your strength ? ");
//        int strength = scanner.nextInt();
//        System.out.println("What is your agility?");
//        int agility = scanner.nextInt();
//        System.out.println("Name:" + name1 + "Strength "+ strength + "Agility" + agility);
//
//        // Level up!'
//        System.out.println( "What is your current level? ");
//        int currentLevel = scanner.nextInt();
//        int newLevel = currentLevel + 1;
//        System.out.println("You leveled up! " + newLevel);

        // coin calculator
//        System.out.println("How many gold and silver coins have you found?");
//        int goldCoins = scanner.nextInt();
//        int silverCoins = scanner.nextInt();
//        int totalPoints = goldCoins * 10 + silverCoins;
//        System.out.println(" Total score: " + totalPoints);

        // odd or even dice
//        int randomDice = (int) (Math.floor(Math.random() * 10) + 1);
//        if (randomDice % 2 == 0) {
//            System.out.println("Numbers is " + randomDice + " even");
//        } else {
//            System.out.println("Number is " + randomDice + " odd");
//        }

        // Critical hit chance
//        System.out.println(" What is your luck stat from 0 - 100 ");
//        int luckStatNum = scanner.nextInt();
//        if (luckStatNum > 50) {
//            System.out.println("Critical Hit! ");
//        } else {
//            System.out.println("Normal Hit ");

      // character class check
        System.out.println(" What is your class? Warrior or mage");
        String heroClass = scanner.nextLine();
        switch (heroClass) {
            case "warrior":
                System.out.println(" Your weapon is : Sword! ");
                break;
            case "mage":
                System.out.println("Your weapon is a Ak47! ");
                break;
            default:
                System.out.println("Your input is incorrect ");
        }

        // magic class check
        

    }
}




