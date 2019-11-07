public class R06_MET01_J
{
        // Rule 06, NC
    // Usage: getAbsAdd(Integer.MIN_VALUE, 1);
    public static int getAbsAdd_NC(int x, int y) {
        assert x != Integer.MIN_VALUE;
        assert y != Integer.MIN_VALUE;
        int absX = Math.abs(x);
        int absY = Math.abs(y);
        assert (absX <= Integer.MAX_VALUE - absY);
        return absX + absY;
    }

    // Rule 06, C
    // Usage: getAbsAdd(Integer.MIN_VALUE, 1);
    public static int getAbsAdd_C(int x, int y) {
        if (x == Integer.MIN_VALUE || y == Integer.MIN_VALUE) {
          throw new IllegalArgumentException();
        }
        int absX = Math.abs(x);
        int absY = Math.abs(y);
        if (absX > Integer.MAX_VALUE - absY) {
          throw new IllegalArgumentException();
        }
        return absX + absY;
      }

}