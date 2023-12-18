package game;



public class Kezdes extends Helyszin implements masikIrany{

    @Override
    public String leiras() {
  
        return "Ez a kezdés,jobbra vagy balra?";
  
    }

    @Override
    public Helyszin egyikIrany() {
 
        return new Balra();
 
    }

    @Override
    public String egyikBtnFelirata() {
 
        return "még tovább...";
 
    }

    @Override
    public String masikBtnFelirata() {
   
        return "Jobbra";
   
    }

    @Override
    public Helyszin masikIrany() {
  
        return new Jobbra();
  
    }

}
