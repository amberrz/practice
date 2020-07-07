public class NextPerfectSquare {
  public static long nextPerfectSquare(long input) throws IllegalArgumentException {
    long nextSquare;
    long root;
    root = Math.round(Math.sqrt(input));
    if (root * root != input) {
      throw new IllegalArgumentException();
    }
    nextSquare = (root + 1) * (root);
    return nextSquare;

  }

}
