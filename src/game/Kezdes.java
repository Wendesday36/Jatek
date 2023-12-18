package game;

public class Kezdes extends Helyszin{

    @Override
    public String leiras() {
  
        return "Ez a kezdés,haladj tovább!";
  
    }

    @Override
    public Helyszin egyikIrany() {
 
        return null;
 
    }

    @Override
    public String egyikBtnFelirata() {
 
        return "még tovább...";
 
    }

}
