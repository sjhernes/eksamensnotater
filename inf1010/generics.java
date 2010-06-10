import java.util.*;
class Node <E> {
    E data;
    Node<E> next;
    
    Node(E e) { data = e; }    
}

class Person {
    String navn;
    Person (String navn) { this.navn = navn; }
}
class tester {
    Node root;
    tester() {
	Person a = new Person("Olav");
	Person b = new Person("Lisa");
	root = new Node(a);
	root.next = new Node(b);
    }
}
