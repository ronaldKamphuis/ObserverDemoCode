package controller;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Ronald Kamphuis <info@ronaldkamphuis.com>
 * Opdracht:
 * Doel:
 */

public class Persbureau {

    private List<Kanaal> kanalen = new ArrayList<>();
    private String nieuws = "";

    public String getNieuws() {
        return nieuws;
    }

    public void ObserverToevoegen (Kanaal kanaal) {
        kanalen.add(kanaal);
    }

    public void ObserverVerwijderen (Kanaal kanaal) {
        this.kanalen.remove(kanaal);
    }

    public void setNieuws(String nieuws){
        this.nieuws = nieuws;
        for (Kanaal kanaal : kanalen) {
            kanaal.update();
        }
    }
}