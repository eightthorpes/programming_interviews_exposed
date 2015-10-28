
public class Node {
  private Node[] children;
  private Object value;

  public Node( Node[] children ){
    this.children = children;
  }

  public int getNumChildren(){
    return children.length;
  }

  public Node getChild( int index ){
    return children[ index ];
  }
}

