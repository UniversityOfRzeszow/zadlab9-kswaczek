/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author maarchyl
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // zadanie 4

        HashMap<String, String> sl = new HashMap<String, String>(21);

        sl.put("dziewczyna", "girl");
        sl.put("chlopak", "boy");
        sl.put("wiek", "age");
        sl.put("zwierze", "animal");
        sl.put("jablko", "appple");
        sl.put("pilka", "ball");
        sl.put("duzy", "big");
        sl.put("czarny", "black");
        sl.put("niebieski", "blue");
        sl.put("rozowy", "pink");
        sl.put("ksiazka", "book");
        sl.put("brat", "brother");
        sl.put("siostra", "sister");
        sl.put("ciasto", "cake");
        sl.put("samochod", "car");
        sl.put("kot", "cat");
        sl.put("pies", "dog");
        sl.put("kolor", "color");
        sl.put("taniec", "dance");
        sl.put("drzwi", "door");

        System.out.println("Dostępne słowa:"
                + "\ndziewczyna,"
                + "chlopak,"
                + "wiek,"
                + "zwierze,"
                + "jablko,"
                + "pilka,"
                + "duży,"
                + "czarny,"
                + "niebieski,"
                + "rozowy,"
                + "ksiazka,"
                + "brat,"
                + "siostra,"
                + "ciasto,"
                + "samochod,"
                + "kot,"
                + "pies,"
                + "kolor,"
                + "taniec,"
                + "drzwi."
                + "\nAby wyjść wpisz koniec.");
        Scanner input = new Scanner(System.in);
        String slowo = null;
        System.out.println("Wpisz słowo: ");
        do {

            slowo = input.nextLine();
            System.out.println("Tłumaczenie: " + sl.get(slowo));
        } while (!"koniec".equals(slowo));
    }

}
