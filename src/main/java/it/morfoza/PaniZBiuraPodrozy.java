package it.morfoza;

import java.util.Scanner;

/**
 * Created by ahann on 02/08/2016.
 */
public class PaniZBiuraPodrozy {

    String name = "Zuzia";
    public Destination chlamDoOpchniecia;
    public Destination superOferta;

    public void zrobWywiad() throws BrakKlientaException {
        System.out.println("Dzień dobry, mam na imię " + name);
        Scanner input = new Scanner(System.in);

        double number1;
        double number2;

        System.out.println("Ile masz hajsu na wakacje? (podaj w PLN)");
        number1 = input.nextInt();

        if (number1 < 10) {
            throw new BrakKlientaException();
        }


        System.out.println("Na ile dni chcesz wyjechać?");
        number2 = input.nextInt();

        double dailyBudget = number1 / number2;
        System.out.println("Twój dzienny budżet to: " + dailyBudget);

        if (dailyBudget >= chlamDoOpchniecia.pricePerDay) {
            System.out.println("Możesz jechać do " + chlamDoOpchniecia.name);
        }
        if (dailyBudget >= superOferta.pricePerDay) {
            System.out.println("Możesz jechać do " + superOferta.name);
        }
    }

}
