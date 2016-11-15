public class TestSort {
  /** test the basic sort method */
  public static void testSort() {
    String[] input = {"hey", "dinner", "zebra"};
    Sort.sort(input);
    String[] expected = {"dinner", "hey", "zebra"};
    org.junit.Assert.assertArrayEqauls(expected, input);
  }

  public static void main(String[] args) {
    testSort();
  }
}