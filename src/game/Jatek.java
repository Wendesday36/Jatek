/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        farkas.felvesz(t1);
        farkas.hasznal("ernyő");
        System.out.println(farkas.toString());
        
        
        jatekment(karakterek);
        
//        jatekbetolt();
        
        
        
        
    }

    private static <T> void kiirTomb(String cim, T[] tomb) {
        System.out.println(cim);
        for (T elem : tomb) {
            System.out.println(elem);
        }
    }

    private static void jatekment(Karakter[] karakterek) {
        try(ObjectOutputStream objKi= new ObjectOutputStream(new FileOutputStream("karakterek.bin"))){
            /* bármilyen, és bármennyi object kiírható 
               most 1 db Karakter[] kerül kiírása bináris formában
            */
            //objKi.writeObject(harcos);
            //objKi.writeObject(varazslo);
            objKi.writeObject(karakterek);
            
            /* ha try resources, akkor nem kell close, 
            mert a try-ból való kilépéskor automatikusan meghívja az 
            AutoCloseable interface által biztosított close metódust
            */
            //objKi.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Jatek.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Jatek.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void jatekbetolt() {
   
    }

}
