/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;

/**
 *
 * @author berta.z.anna
 */
public class Jobbra extends Helyszin implements masikIrany{

    @Override
    public String leiras() {
   
        return "Jobbra fordultunk";
   
    }

    @Override
    public String egyikBtnFelirata() {

        return "Nyugat";

    }
    

    @Override
    public Helyszin egyikIrany() {
        return this;
    }

    @Override
    public String masikBtnFelirata() {
        return "Kelet";
    }

    @Override
    public Helyszin masikIrany() {
    return this;
    }
    
}
