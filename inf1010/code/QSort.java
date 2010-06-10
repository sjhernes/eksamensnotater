public class QSort {
    static int antallBytt = 0;

    public static void main(String[] args) {
	char [] tegn = {'e','k','s','e','m','p','e','l'};
	quicksort(tegn,0,tegn.length-1);
    }
    static void quicksort(char[] a, int fra, int til) {
	//man kan ikke sortere bare en ting
	if (!(til-fra < 1)){
	    //vi velger et tall som vi skal
            char pivot = a[til];
	    boolean ikkeFerdig = true;
	    int i = fra;
	    int j = til - 1;
	    while (ikkeFerdig) {
		while (a[i] < pivot) { i++ ;}// vi finner stedet
		while (a[j] > pivot) { j--;}// der vi vil bytte
		if (i < j) { // hvis vi ikke har funnet midten
		    bytt(a, i, j);
		    i++; j--;
		} else ikkeFerdig = false; // 
	    }
            bytt(a, i, til);
            quicksort(a, fra, i-1);
            quicksort(a, i+1, til);
	}
    }
    static void bytt (char[] a, int fra, int til) {
	char temp = a[til];
	a[til] = a[fra];
	a[fra] = temp;
    }
}
