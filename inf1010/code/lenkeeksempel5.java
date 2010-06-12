/** Setter personobjektet i inn etter personobjektet e
* Hverken i eller e er NULL.
* @param e Personobjektet som skal ha i som neste
* @param i Personobjektet som skal inn etter i
*/

void settInnPersonEtter ( Person e , Person i ) {
    i.nestePerson = e.nestePerson ;
    e.nestePerson = i ;
}