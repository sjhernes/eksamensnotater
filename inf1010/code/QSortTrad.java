public class QSortTrad {
    int antallTrader = 1, ferdige = 0;
    char[] a;

    QSortTrad(){
	a = "åøæzywvutsrqponmlkjihgfedcba".toCharArray();
	new Qtrad(0,a.length-1).start();
	while(antallTrader!=ferdige){
	    try { Thread.sleep(0); } catch (Exception e) {};
	}
	for(int i=0;i<a.length;i++){System.out.print(a[i]+" ");}
    }
    
    public static void main(String[] args) {new QSortTrad();}

    class Qtrad extends Thread {
	int fra, til;
	Qtrad(int i, int j){fra = i; til = j;}

	public void run() {
	    if (!(til-fra < 1)){
		char pivot = a[til];
		boolean ikkeFerdig = true;
		int forst = fra; 
		int sist = til - 1;

		while (ikkeFerdig) {
		    while (a[forst] < pivot && forst<a.length-1) { forst++ ;}
		    while (a[sist] > pivot && sist>0) { sist--;}
		    if (forst < sist) { 
			bytt(a, forst, sist);
			forst++; sist--;
		    } else ikkeFerdig = false; 
		}
	
		bytt(a, forst, til);
		antallTrader++;
		new Qtrad(fra, forst-1).start();
		fra = forst+1;
		run();
	    } else { 
		ferdige++;
	    }
	}
	void bytt (char[] a, int fra, int til) {
	    char temp = a[til];
	    a[til] = a[fra];
	    a[fra] = temp;
	}
    }
}
