package it.morfoza;

import java.util.Scanner;

/**
 * Created by ahann on 02/08/2016.
 */
public class Budget {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double number1;

        double number2;


        System.out.println("Ile masz hajsu na wakacje? (podaj w PLN)");
        number1 = input.nextInt();

        System.out.println("Na ile dni chcesz wyjechać?");
        number2 = input.nextInt();


        double dailyBudget = number1/number2;
        System.out.println("Twój dzienny budżet to: " + dailyBudget);





    }

}