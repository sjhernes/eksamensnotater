abstract class Sammenlignbar <E> {
	abstract int compareTo(E e);
	
	public class Node <E extends Comparable<E>> {
		E data;
		Node<E> venstre, høyre;
	
		Node(E e) { data = e; }
	
		SettInnNyNode(Node nn) {
			int cmpt = data.compareTo(nn.data);
			if (cmpt < 0) { // data < nn, nn skal være mot høyere
				if (høyere = null) høyere = nn;
				else høyere.settInnNyNode(nn);
			}
		}
		class Person implements Comparable <Person> {
			int fdato;
			Person (int fd) fdato = fd;
			public int compareTo(Person p){
				return fdato - p.fdato;
			}
		}
	}
}