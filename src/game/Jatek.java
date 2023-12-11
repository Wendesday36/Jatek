/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;

/**
 *
 * @author berta.z.anna
 */
public class Jatek {

    public static void main(String[] args) {
        Karakter goblin = new Karakter("goblinka");
        Karakter farkas = new Karakter("farkas");
        Targy t1 = new Targy("esernyo", "ernyő");
        Targy t2 = new Targy("kaja", "husika");
        farkas.felvesz(t2, 5);
        goblin.felvesz(t1);
        Karakter[] karakterek = {goblin, farkas};
        kiirTomb("jatekosok:", karakterek);
        
        kiirTomb("jatekosok elem használattal:", karakterek);
        System.out.println("Farkas elem hasznalat:");
        farkas.hasznal("husika", 6, true);
        System.out.println(farkas.toString());
        farkas.felvesz(t2);
        System.out.println(farkas.toString());
    }

    private static <T> void kiirTomb(String cim, T[] tomb) {
        System.out.println(cim);
        for (T elem : tomb) {
            System.out.println(elem);
        }
    }

}
