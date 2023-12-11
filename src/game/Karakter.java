/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;


import java.util.ArrayList;

/**
 *
 * @author berta.z.anna
 */
public class Karakter {
    private int eletero;
    private int ugyesseg;
    private int szerencse;
    private ArrayList<Targy> felszereles;

    public <T> Karakter() {
        this.eletero =( dobokocka()+dobokocka())+12;
        this.ugyesseg = dobokocka()+6;
        this.szerencse = dobokocka()+6;
        this.felszereles=felszereles;
       
    }
    
    private int dobokocka(){
        int kocka=(int) ((Math.random()*6)-1)+1;
        return kocka;
        
    }
    
    public ArrayList<Targy> felvesz(Targy targy){
        felszereles.add(targy);
            System.out.println("felvette:"+targy);
        return felszereles;
        
       
        
    }
    public ArrayList<Targy> felvesz(Targy targy,int darab){
        for (int i = 0; i < darab; i++) {
            System.out.println("felvette:"+targy);
        }
        felszereles.add(targy);
        return felszereles;
        
    }

    @Override
    public String toString() {
        return "Karakter{" + "eletero=" + eletero + ", ugyesseg=" + ugyesseg + ", szerencse=" + szerencse + ", felszereles=" + felszereles + '}';
    }
    
    
    
}
