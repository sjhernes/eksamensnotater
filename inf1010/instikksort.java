class InSort{
    public static void main(String[] args){
	// mengden som skal sorteres 
	int[] mengde = {4, 2, 6, 3, 7, 1, 5}; 
	for(int i=0;i<mengde.length;i++){
	    // hvor vi er og hva vi skal stikke inn 
	    int j=i, temp=mengde[i]; 
	    // går igjennom alt som er sortert frem til punktet der 
	    // vi enten er på starten av lista, eller at det neste 
	    // sorterte elementet er mindre enn temp
	    while(j>0 && mengde[j-1] > temp){ 
		// Vi dytter lista fremover for å gjøre plass til innstikk
		mengde[j]=mengde[j-1]; 
		j--;
	    }
	    // når vi har funnet riktig sted setter vi inn
	    mengde[j] = temp;
	}
    }
}