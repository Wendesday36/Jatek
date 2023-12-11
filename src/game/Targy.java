package game;

import java.util.UUID;

public class Targy {

    String leiras, nev;
    private UUID id;

    public Targy(String leiras, String nev) {
        this.leiras = leiras;
        this.nev = nev;
        id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public String getLeiras() {
        return leiras;
    }

    public String getNev() {
        return nev;
    }

    @Override
    public String toString() {
        return "Targy{" + "leiras=" + leiras + ", nev=" + nev + ", id=" + id + '}';
    }

}
