public class QSort {
    static int antallBytt = 0;

    public static void main(String[] args) {
	char [] tegn = "åøæzywvutsrqponmlkjihgfedcba".toCharArray();
	quicksort(tegn,0,tegn.length-1);
	for(int i = 0;i < tegn.length; i++){
	    System.out.print(tegn[i]+" "); 
	}
    }
    static void quicksort(char[] a, int fra, int til) {
	//man kan ikke sortere bare en ting
	if (!(til-fra < 1)){
	    //vi velger et tall som vi skal
            char pivot = a[til];
	    boolean ikkeFerdig = true;
	    int forst = fra;     // der vi midlertidig pivoterer rundt, 
	    int sist = til - 1;  // snevrer oss mot et punkt
	    while (ikkeFerdig) {
		while (a[forst] < pivot && forst<a.length-1) { forst++ ;}// vi finner stedet
		while (a[sist] > pivot && sist>0) { sist--;}// der vi vil bytte
		if (forst < sist) { // hvis vi ikke har funnet midten
		    bytt(a, forst, sist);
		    forst++; sist--;
		} else ikkeFerdig = false; 
	    }
            bytt(a, forst, til);
            quicksort(a, fra, forst-1);
            quicksort(a, forst+1, til);
	}
    }
    static void bytt (char[] a, int fra, int til) {
	char temp = a[til];
	a[til] = a[fra];
	a[fra] = temp;
    }
}
