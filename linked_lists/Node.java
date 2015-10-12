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

  void deleteNode(int d) {
    Node n = this;

    if (n.data == d) {
      n = n.next;
      return;
    }

    while (n.next != null) {
      if (n.next.data == d) {
        n.next = n.next.next;
        return;
      }
      n = n.next;
    }
  }

  void print() {
    Node n = this;
    while (n != null) {
      System.out.println(n.data);
      n = n.next;
    }
  }

  void deDuplicate() {
    // At each node, start from here and check until the end
    Node n = this;
    while (n.next != null) {
      Node o = n;
      while (o.next != null) {
        if (o.next.data == n.data) {
          o.next = o.next.next;
        }
        o = o.next;
      }
      n = n.next;
    }
    return;
  }

  public static void main(String[] args) {
    Node p = new Node(0);
    int[] arr = {1, 1, 2, 3, 5, 8, 13, 21, 34, 8, 5, 55, 89, 144, 233, 377};
    for (int i : arr) {
      p.appendToTail(i);
    }
    p.print();
    p.deDuplicate();
    p.print();
  }

}
