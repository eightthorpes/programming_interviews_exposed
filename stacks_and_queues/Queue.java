public class Queue {
  public Queue() {
    s1 = new Stack();
    s2 = new Stack();
  }
  Stack s1;
  Stack s2;

  Object pop() {
    while (s1.peek() != null) {
      s2.push(s1.pop());
    }
    Object item = s2.pop();
    while (s2.peek() != null) {
      s1.push(s2.pop());
    }
    return item;
  }

  void push(Object item) {
    s1.push(item);
  }

  public static void main(String[] args) {
    Queue q = new Queue();
    q.push(1);
    q.push(2);
    q.push(3);
    q.push(4);
    q.push(5);
    System.out.println(q.pop());
    System.out.println(q.pop());
    System.out.println(q.pop());
    System.out.println(q.pop());
    System.out.println(q.pop());
  }
 
}
