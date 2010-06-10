public class FinnMinst {
    final int maxVerdiInt = Integer.MAX_VALUE;
    int [ ] tabell; // mengden vi skal søke igjennom
    Oversikt oversikt; // her trådene raporterer

    public static void main(String[ ] args) {
	new FinnMinst();
    }

    public FinnMinst(){
	// vi lager mengden vi skal søke igjennom med random ints
	tabell = new int[64000];
	for (int in = 0; in< 64000; in++) 
	    tabell[in] = (int)Math.round(Math.random()* maxVerdiInt);

	//vi lager et overvåkningsobjekt som mottar info fra trådene
	oversikt = new Oversikt();
	for (int i = 0; i< 64; i++)

	    // Lager 64 tråder, og hvilken del av arrayet de skal søke på
	    new Soketraad(tabell,i*1000,((i+1)*1000)-1,oversikt).start(); 

	oversikt.vent(); // er ikke ferdig før alt er søkt igjennom
        System.out.println("Minste verdi var: " + oversikt.minste);
    }
}

class Oversikt {
    int minste = Integer.MAX_VALUE, antallFerdigeTrader = 0;  
    
    synchronized void vent() {
	while (antallFerdigeTrader != 64) {
	    try {wait();} catch (InterruptedException e){}      
	}
    } 

    //mottar tall fra en tråd og ser om den er mindre enn den minste
    synchronized void giMinste (int minVerdi) {
	antallFerdigeTrader++;
	if(minste > minVerdi) minste = minVerdi;      
	notify();
    }
}

class Soketraad extends Thread {
    int [ ] tab; int start, end; Oversikt ov;
  
    Soketraad(int [ ] tb, int st, int en, Oversikt o) {
	tab = tb; start = st; end = en; ov = o; 
    }
 
    public void run(){
	int minVerdi = Integer.MAX_VALUE;     
	for (int i = start; ind <= end; i++)
	    if(tab[i] < minVerdi) minVerdi = tab[i];
	ov.giMinste(minVerdi);
    } 
}
