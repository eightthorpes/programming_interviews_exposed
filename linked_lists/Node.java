import java.util.Arrays;

public class Node {
  Node next = null;
  int data;

  public Node(int d) {
    data = d;
  }

  void appendToTail(int d) {
    Node end = new Node(d);
    Node n = this;
    while (n.next != null) {
      n = n.next;
    }
    n.next = end;
  }

  Node deleteNode(Node head, int d) {
    Node n = head;

    if (n.data == d) {
      return head.next;
    }

    while (n.next != null) {
      if (n.next.data == d) {
        n.next = n.next.next;
        return head;
      }
      n = n.next;
    }
    return head;
  }

  Node deDuplicate(Node head) {
    // At each node, start from the beginning and check all previous
    Node n = head;

    while (n.next != null) {
      Node o = head;
      while (n != o) {
        if (n.data == o.data) {
          //delete node
        }

    }
  }
    

  public static void main(String[] args) {
    Node p = new Node(0);
    int[] arr = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377};
    for (int i : arr) {
      p.appendToTail(i);
    }
  }

}
