package controller;

/**
 * @author Ronald Kamphuis <info@ronaldkamphuis.com>
 * Opdracht:
 * Doel:
 */

public class NOS extends Kanaal {

    public NOS(Persbureau persbureau){
        this.persbureau = persbureau;
        this.persbureau.ObserverToevoegen(this);
    }

    private final String STATION = "NOS";

    @Override
    public void update() {
        System.out.println(STATION + ": " + persbureau.getNieuws());
    }
}
