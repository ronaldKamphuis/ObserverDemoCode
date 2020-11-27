package controller;

import javax.security.auth.Subject;

/**
 * @author Ronald Kamphuis <info@ronaldkamphuis.com>
 * Opdracht:
 * Doel:
 */

public class RTL extends Kanaal {

    public RTL(Persbureau persbureau){
        this.persbureau = persbureau;
        this.persbureau.ObserverToevoegen(this);
    }

    private final String STATION = "RTL";

    @Override
    public void update() {
        System.out.println(STATION + ": " + persbureau.getNieuws());
    }
}
