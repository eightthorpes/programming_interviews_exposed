import java.lang.System;

public class Node {
  private Node left;
  private Node right;
  private Object value;

  public Node getLeft() {
    return this.left;
  }

  public Node getRight() {
    return this.right;
  }

  public void setLeft(Node left) {
    this.left = left;
  }

  public void setRight(Node right) {
    this.right = right;
  }
  public Node(){
    left = null;
    right = null;
  }

  public int getHeight() {
    int height = 1;
    int leftHeight = 0;
    int rightHeight = 0;
    if (this.left != null) {
      leftHeight = left.getHeight();
    }
    if (this.right != null) {
      rightHeight = right.getHeight();
    }
    return Math.max(rightHeight, leftHeight) + 1;
  }

  public boolean isBalanced() {
    boolean retval = true;
    int leftHeight = 0;
    int rightHeight = 0;
    if (this.left != null) {
      if (left.isBalanced() == true) {
        leftHeight = left.getHeight();
      } else {
        return false;
      }
    }
    if (this.right != null) {
      if (right.isBalanced() == true) {
        rightHeight = right.getHeight();
      } else {
        return false;
      }
    }
    if (Math.abs(leftHeight - rightHeight) > 1) {
      return false;
    } else {
      return true;
    }
  }

  public static void main(String[] args) {
    Node head = new Node();

    Node lll = new Node();
    //Node llll = new Node();

    Node ll = new Node();
    Node lr = new Node();
    Node rr = new Node();
    Node rl = new Node();

    Node l = new Node();
    Node r = new Node();

    //lll.setLeft(llll);

    ll.setLeft(lll);

    l.setLeft(ll);
    l.setRight(lr);

    r.setLeft(rl);
    r.setRight(rr);

    head.setLeft(l);
    head.setRight(r);



    System.out.println(head.isBalanced());
  }
}

