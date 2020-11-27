package controller;

/**
 * @author Ronald Kamphuis <info@ronaldkamphuis.com>
 * Opdracht:
 * Doel:
 */

public class Telegraaf extends Kanaal {

    public Telegraaf(Persbureau persbureau){
        this.persbureau = persbureau;
        this.persbureau.ObserverToevoegen(this);
    }

    private final String STATION = "Telegraaf";

    @Override
    public void update() {
        System.out.println(STATION + ": " + persbureau.getNieuws());
    }
}
