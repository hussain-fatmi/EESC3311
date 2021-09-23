public class DoSomething {
  private static int FOO = 2; // Unused variable
  private int i = 5; // Unused variable
  private int j = 6;

  public int add() {
    return j++;
  }
  
  public void doAlmostNothing() {
    int i = 5; // Unused
  }
}