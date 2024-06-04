
package main;

import java.util.logging.Level;
import java.util.logging.Logger;
import modell.Csiguszka;


public class CsiguszProblema {
    
    public static void main(String[] args) {
        try {
            //        Csigusz cs0  = new Csigusz();
//        feladat(cs0);

Csiguszka cs1 = new Csiguszka("cs-1");
feladat(cs1);

Csiguszka cs2 = new Csiguszka("c-2", Csiguszka.Szinek.ZOLD);
feladat(cs2);

Csiguszka cs3 = new Csiguszka("VikiCsiga", Csiguszka.Szinek.PIROS);
feladat(cs3);
        } catch (Exception ex) {
            //Logger.getLogger(CsiguszProblema.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("-- Egy csigusz nem jött létre!");
            System.err.println("A hiba oka: "+ex.getMessage());
        }
    }

    private static void feladat(Csiguszka cs1) {
        System.out.println(cs1.toString());
        char elso = cs1.getSzin().charAt(0);
        System.out.println("A szín első betűje: "+elso);
    }
    
}