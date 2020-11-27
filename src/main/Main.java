package main;

import controller.NOS;
import controller.Telegraaf;
import controller.RTL;
import controller.Persbureau;

/**
 * @author Ronald Kamphuis <info@ronaldkamphuis.com>
 * Opdracht:
 * Doel:
 */

public class Main {
    public static void main(String[] args) {

        Persbureau ANP = new Persbureau();
        new RTL(ANP);
        new NOS(ANP);
        new Telegraaf(ANP);

        ANP.setNieuws("Er staat een man op de maan");
    }
}
