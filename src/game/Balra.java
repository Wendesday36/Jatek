/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;

/**
 *
 * @author berta.z.anna
 */
public class Balra extends Helyszin implements masikIrany{

    @Override
    public String leiras() {
  
        return "Balra mentunk,haladj tovább...";
  
    }

    @Override
    public String egyikBtnFelirata() {
   
        return "Észak...";
   
    }

    @Override
    public Helyszin egyikIrany() {
    
        return this;
    
    }

    @Override
    public String masikBtnFelirata() {
  
        return "Dél";
  
    }

    @Override
    public Helyszin masikIrany() {
        return this;
    }
    
}
