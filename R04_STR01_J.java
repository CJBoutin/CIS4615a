public class R04_STR01_J
{
    // Non compliant
    public static String trim_NC(String string) {
        char ch;
        int i;
        for (i = 0; i < string.length(); i += 1) {
          ch = string.charAt(i);
          if (!Character.isLetter(ch)) {
            break;
          }
        }
        return string.substring(i);
    }

    // Compliant
    public static String trim_C(String string) {
        int ch;
        int i;
        for (i = 0; i < string.length(); i += Character.charCount(ch)) {
          ch = string.codePointAt(i);
          if (!Character.isLetter(ch)) {
            break;
          }
        } 
        return string.substring(i);
    }
}