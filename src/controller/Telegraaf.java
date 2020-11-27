package controller;

/**
 * @author Ronald Kamphuis <info@ronaldkamphuis.com>
 * Opdracht:
 * Doel:
 */

public class Telegraaf implements Kanaal {

    private final String STATION = "Telegraaf";
    private String nieuws;

    public String getNieuws() {
        return nieuws;
    }

    public void setNieuws(String nieuws) {
        this.nieuws = nieuws;
    }

    @Override
    public void update(Object nieuws) {
        this.setNieuws(STATION + ": BREAKING BREAKING BREAKING!!!: " + nieuws);
    }

}
