import java.util.Arrays;

public class Three_Stack {
  Object[] stacks = new Object[51];
  int[] pointers = {-3, -2, -1};

  Object pop(int n) {
    if  (pointers[n] >= 0) {
      Object item = stacks[pointers[n]];
      pointers[n] -= 3;
      return item;
    }
    return null;
  }

  void push(Object item, int n) {
    pointers[n] += 3;
    stacks[pointers[n]] = item;
  }

  Object peek(int n) {
    return stacks[pointers[n]];
  }


  public static void main(String[] args) {
    Three_Stack ts = new Three_Stack();
    Integer one = new Integer(1);
    Integer two = new Integer(2);
    Integer three = new Integer(3);
    ts.push(one, 0);
    ts.push(two, 1);
    ts.push(one, 1);
    ts.push(three, 2);
    System.out.println(ts.pop(1));
    ts.push(three, 2);
    System.out.println(ts.peek(1));
  }

}
