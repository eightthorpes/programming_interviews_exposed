import java.util.List;
import java.util.ArrayList;


public class Node {
  List children = new ArrayList();
  Object data;

  public Node(Object d) {
    this.data = d;
  }

  public boolean isConnected(Node n, List visited) {
    if (visited == null) {
      visited = new ArrayList();
    }
    visited.add(this);
    return false;
  }

  public static void main(String[] args) {
    Node p = new Node(0);
    Node q = new Node(1);
    Node r = new Node(2);
    Node s = new Node(3);
    Node t = new Node(4);
    Node u = new Node(5);
    Node v = new Node(6);
    Node w = new Node(7);

    p.children.add(r);
    p.children.add(s);

    q.children.add(t);

    r.children.add(q);

    s.children.add(r);
    s.children.add(v);

    t.children.add(p);

    u.children.add(v);

    v.children.add(p);
  }
}

