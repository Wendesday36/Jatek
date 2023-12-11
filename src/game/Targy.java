
package game;

import java.util.UUID;

public class Targy {
    String leiras,nev;
     private UUID id;

    public Targy(String leiras, String nev) {
        this.leiras = leiras;
        this.nev = nev;
        id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }
    
    
     
}
