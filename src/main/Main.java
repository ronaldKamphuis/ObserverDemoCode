package main;

import controller.NOS;
import controller.RTL;
import controller.Persbureau;
import controller.Telegraaf;

/**
 * @author Ronald Kamphuis <info@ronaldkamphuis.com>
 * Opdracht:
 * Doel:
 */

public class Main {
    public static void main(String[] args) {

        Persbureau ANP = new Persbureau();
        RTL observeerder = new RTL();
        NOS observeerder2 = new NOS();
        Telegraaf observeerder3 = new Telegraaf();

        ANP.ObserverToevoegen(observeerder);
        ANP.ObserverToevoegen(observeerder2);
        ANP.ObserverToevoegen(observeerder3);

        ANP.setNieuws("Er staat een man op de maan");

        System.out.println(observeerder.getNieuws());
        System.out.println(observeerder2.getNieuws());
        System.out.println(observeerder3.getNieuws());

    }
}
