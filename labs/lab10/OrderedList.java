import java.util.NoSuchElementException;

public class OrderedList implements OrderedStructure {

    // Implementation of the doubly linked nodes (nested-class)

    private static class Node {

      	private Comparable value;
      	private Node previous;
      	private Node next;

      	private Node ( Comparable value, Node previous, Node next ) {
      	    this.value = value;
      	    this.previous = previous;
      	    this.next = next;
      	}
    }

    // Instance variables

    private Node head;
    private Node tail;
    private int size;

    // Representation of the empty list.

    public OrderedList() {
      // Your code here.
      head = null;
      tail = null;
    }

    // Calculates the size of the list

    public int size() {
      // Remove line below and add your implementation.
      Node p = head;
      int count = 0;
      while( p!=null) {
        p = p.next;
        count++;
      }
      return count;
    }


    public Object get( int pos ) {
      // Remove line below and add your implementation.
      if (pos < 0){
        throw new IndexOutOfBoundsException(Integer.toString(pos));
      }
      Node p = head;
      for(int i = 0; i < pos; i++) {
        if(p == null) {
          throw new IndexOutOfBoundsException(Integer.toString(pos));
        }
        else {
          p = p.next;
        }
      }
      return p.value;
    }

    // Adding an element while preserving the order

    public boolean add( Comparable o ) {
      // Remove line below and add your implementation.
      if(o == null) {
        throw new IllegalArgumentException("null");
      }
      if(head == null) {
        head = tail = new Node(o, null, null); 
      }
      else if (head.value.compareTo(o) >= 0) {
        head = new Node (o, null, head);
        head.next.previous = head;
      } 
      else {
        Node p = head;
        while(p.next != null && p.next.value.compareTo(o) < 0) {
          p = p.next;
        }
        if(p.next == null) {
          tail.next = new Node(o, tail, null);
          tail = tail.next;
        } 
        else {
          Node q = p.next;
          p.next = new Node(o, p, q);
          q.previous = p.next;
        }
      }
      size++;
      return true;
    }

    //Removes one item from the position pos.

    public void remove( int pos ) {
      // Remove line below and add your implementation.
      if(pos < 0) {
        throw new IndexOutOfBoundsException(Integer.toString(pos));
      }
      Node p = head;
      if(pos == 0) {
        if(head == null) {
          throw new IndexOutOfBoundsException(Integer.toString(pos));
        }
        head = head.next;
        if(head == null) {
          tail = null;
        } 
        else {
          head.previous = null;
        }
        p.value = null;
        p.next = null;
      } 
      else {
        for(int i = 0; i < pos; i++) {
          if(p == null) {
            throw new IndexOutOfBoundsException(Integer.toString(pos));
          } 
          else {
            p = p.next;
          }
        }
        Node del = p;
        p = p.previous;
        Node q = del.next;
        p.next = q;
        if(del == tail){
          tail = p;
        } 
        else  {
          q.previous = p;
        }
        del.value = null;
        del.next = null;
        del.previous = null;
      }
    }

    // Knowing that both lists store their elements in increasing
    // order, both lists can be traversed simultaneously.

    public void merge( OrderedList other ) {
      // Remove line below and add your implementation.
      if(other == null) {
        throw new IllegalArgumentException("null");
      }
      for(int i = 0; i < other.size(); i++) {
        this.add((Comparable)other.get(i));
      }
    }
}
