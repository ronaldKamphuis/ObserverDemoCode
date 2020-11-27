package controller;

/**
 * @author Ronald Kamphuis <info@ronaldkamphuis.com>
 * Opdracht:
 * Doel:
 */

public class RTL implements Kanaal {

    private final String STATION = "RTL";
    private String nieuws;

    public String getNieuws() {
        return nieuws;
    }

    public void setNieuws(String nieuws) {
        this.nieuws = nieuws;
    }

    @Override
    public void update(Object nieuws) {
        this.setNieuws(STATION + ": Goeie'smiddags! : " + nieuws);
    }

}
