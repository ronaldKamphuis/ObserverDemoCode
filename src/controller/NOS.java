package controller;

/**
 * @author Ronald Kamphuis <info@ronaldkamphuis.com>
 * Opdracht:
 * Doel:
 */

public class NOS implements Kanaal {

    private final String STATION = "NOS";
    private String nieuws;

    public String getNieuws() {
        return nieuws;
    }

    public void setNieuws(String nieuws) {
        this.nieuws = nieuws;
    }

    @Override
    public void update(Object nieuws) {
        this.setNieuws(STATION + ": Beste dames en heren: " + nieuws);
    }

}
