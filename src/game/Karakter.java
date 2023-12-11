package game;

import java.io.Serializable;
import java.util.ArrayList;

public class Karakter implements Serializable{

    private int eletero;
    private int ugyesseg;
    private int szerencse;
    private ArrayList<Targy> felszereles;
    private String nev;

    public <T> Karakter(String nev) {
        this.nev = nev;
        this.eletero = dobokocka() + dobokocka() + 12;
        this.ugyesseg = dobokocka() + 6;
        this.szerencse = dobokocka() + 6;
        this.felszereles = new ArrayList<>();

    }

    private int dobokocka() {
        int kocka = (int) ((Math.random() * 6) - 1) + 1;
        return kocka;

    }

    public void felvesz(Targy targy) {
        felvesz(targy, 1);

    }

    public void felvesz(Targy targy, int darab) {
        for (int i = 0; i < darab; i++) {
            System.out.println("felvette:" + targy);
            felszereles.add(targy);
        }

    }

    public void hasznal(String nev) {
        int i = 0;
        while (i < felszereles.size() && felszereles.get(i).getNev() != nev) {
            i++;
        }

        if (i < felszereles.size()) {

            felszereles.remove(i);

        } else {
            System.out.println("Nincs ilyen elem");
        }
    }

    public void hasznal(String nev, int db) {
        for (int i = 0; i < db; i++) {
            hasznal(nev);
        }

    }

    public void hasznal(String nev, int db, boolean van) {
        
        if (van == true) {
            hasznal(nev, db);
        }else{
            System.out.println("Nem töröltük... ");
        }
    }

    @Override
    public String toString() {
        return "Karakter{" +"nev:"+nev+ ", eletero=" + eletero + ", ugyesseg=" + ugyesseg + ", szerencse=" + szerencse + ", felszereles=" + felszereles + '}';
    }

    


}
