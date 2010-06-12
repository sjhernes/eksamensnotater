void settInnPersonForst ( Person inn ) {
    // Hvis lista er tom, sett inn objektet
    if(personliste == null) personliste = inn ;
    else {
	// minst et objekt i lista
	inn.nestePerson = personliste ;
	personliste = inn;
    }
}