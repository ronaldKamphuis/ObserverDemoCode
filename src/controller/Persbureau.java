package controller;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Ronald Kamphuis <info@ronaldkamphuis.com>
 * Opdracht:
 * Doel:
 */

public class Persbureau {
    private String nieuws;
    private List<Kanaal> kanalen = new ArrayList<>();

    public void ObserverToevoegen (Kanaal kanaal) {
        this.kanalen.add(kanaal);
    }

    public void ObserverVerwijderen (Kanaal kanaal) {
        this.kanalen.remove(kanaal);
    }

    public void setNieuws(String nieuws){
        this.nieuws = nieuws;
        for (Kanaal kanaal : this.kanalen) {
            kanaal.update(this.nieuws);
        }
    }

}