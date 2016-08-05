package it.morfoza;

import java.util.Scanner;

/**
 * Created by ahann on 02/08/2016.
 */
public class Budget {



    public static void main(String[] args) throws BrakKlientaException {

        PaniZBiuraPodrozy milaPaniZBiura = new PaniZBiuraPodrozy();

        Destination wymarzoneMiejsce = new Destination();
        wymarzoneMiejsce.name = "Honolulu";
        wymarzoneMiejsce.pricePerDay = 459;
        wymarzoneMiejsce.howFar = 8500;

        milaPaniZBiura.chlamDoOpchniecia = wymarzoneMiejsce;



        int dupa = 1;
        milaPaniZBiura.zrobWywiad();
        dupa = 2;
        milaPaniZBiura.zrobWywiad();
        dupa = 3;
        milaPaniZBiura.zrobWywiad();
        System.out.println(wymarzoneMiejsce);
    }



}