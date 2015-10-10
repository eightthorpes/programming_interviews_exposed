import java.util.Arrays;

public class Permutations {

  public boolean is_perm(String str_1, String str_2) {
    
    char[] chars_1 = str_1.toCharArray();
    char[] chars_2 = str_2.toCharArray();
    Arrays.sort(chars_1);
    Arrays.sort(chars_2);
    if (Arrays.equals(chars_1, chars_2)) {
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    Permutations p = new Permutations();
    System.out.println(p.is_perm(args[0], args[1]));
  }


}
