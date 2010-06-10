class List<E>{
    Node root;
    
    class Node{
	Node(E e) lagretObjekt = e; 
	E lagretObjekt;
	Node next;
    }    
    void put(E e){
	Node n = new Node(e);
	if(root == null) root = n;
	else{ 
	    n.next = root; 
	    root = n;
	}
    }    
    E pop(){
	E tmp = root.e;
	root = root.next;
	return tmp;
    }
}