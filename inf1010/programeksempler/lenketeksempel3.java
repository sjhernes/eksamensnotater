void settInnPersonForst ( Person inn ) {
\\ Hvis l i s ta er tom, sett inn objektet
i f ( personliste == null ) personliste = inn ;
else {
\\ minst et objekt i l i s ta
inn . nestePerson = personliste ;
personliste = inn
}
}