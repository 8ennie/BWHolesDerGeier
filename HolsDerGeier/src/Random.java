import java.util.ArrayList;

public class Random extends HolsDerGeierSpieler {
    
    /* Hier stehen die Karten, die noch nicht gespielt wurden */
    private ArrayList<Integer> nochNichtGespielt=new ArrayList<Integer>();

       
    public Random() {
        //  Meine Karten            
       
    }
    
    public void reset() {
        nochNichtGespielt.clear();
        for (int i=1;i<=15;i++)            
            nochNichtGespielt.add(i);                     
    }

    /**   
     *  Spiele zufaellig eine Karte
    */
    private int spieleZufallskarte() {
        int nochVorhanden=nochNichtGespielt.size();            
        int index=(int) (Math.random()*nochVorhanden);
        int ret=nochNichtGespielt.remove(index);
        return ret;
    }
    
    public int gibKarte(int naechsteKarte) {
        
        return spieleZufallskarte();
        
    }
        
    
    
    
}
