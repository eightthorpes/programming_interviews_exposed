import java.util.Arrays;

public class Uniq {

  public boolean is_uniq(String str, String t) {
    if (str.length() < 2) {
      return true;
    }
    char[] chars = str.toCharArray();
    Arrays.sort(chars);
    for (int i = 1; i < chars.length; i++) {
      if (chars[i] == chars[i - 1]) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    Uniq u = new Uniq();
    System.out.println(u.is_uniq(args[0], "foo"));
  }


}
