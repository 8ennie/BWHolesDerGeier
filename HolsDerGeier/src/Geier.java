public class Geier extends HolsDerGeierSpieler {
    
	
	
   public void reset () {
    }
   
    public int gibKarte(int naechsteKarte) {
        System.out.println(this.getClass());
        if (naechsteKarte<0)
            return naechsteKarte+6;
        return naechsteKarte+5;
        
    }
    
    
}
