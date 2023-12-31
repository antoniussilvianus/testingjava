public class DoublyLinkedList {

  private Node head;
  private Node tail;

  public void insertAtFront(int value) {
    Node newNode = new Node(value);
    if (head == null) {
      head = newNode;
      tail = newNode;
    } else {
      newNode.next = head;
      head.previous = newNode;
      head = newNode;
    }
  }

  public void insertAtEnd(int value) {
    Node newNode = new Node(value);
    if (head == null) {
      head = newNode;
      tail = newNode;
    } else {
      tail.next = newNode;
      newNode.previous = tail;
      tail = newNode;
    }
  }

  public void deleteAtFront() {
    if (head == null) {
      return; // List is empty
    }
    if (head == tail) {
      head = null;
      tail = null;
    } else {
      head = head.next;
      head.previous = null;
    }
  }

  public void deleteAtEnd() {
    if (head == null) {
      return; // List is empty
    }
    if (head == tail) {
      head = null;
      tail = null;
    } else {
      tail = tail.previous;
      tail.next = null;
    }
  }

  public void display() {
    Node current = head;
    if (head == null) {
      return; // List is empty
    }
    System.out.print("Nodes in the doubly linked list: ");
    while (current != null) {
      System.out.print(current.value + " ");
      current = current.next;
    }
    System.out.println();
  }

  private class Node {

    private int value;
    private Node previous;
    private Node next;

    public Node(int value) {
      this.value = value;
    }
  }
}

public class Main {

  public static void main(String[] args) {
    DoublyLinkedList dll = new DoublyLinkedList();

    dll.insertAtEnd(10);
    dll.insertAtEnd(20);
    dll.insertAtFront(5);

    dll.display(); // Output: Nodes in the doubly linked list: 5 10 20

    dll.deleteAtEnd();
    dll.display(); // Output: Nodes in the doubly linked list: 5 10

    dll.deleteAtFront();
    dll.display(); // Output: Nodes in the doubly linked list: 10
  }
}
