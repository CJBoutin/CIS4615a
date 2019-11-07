import java.math.BigInteger;

public class R04_STR03_J
{
        // Rule 04, NC
        public static void Rule04_NC()
        {
            BigInteger x = new BigInteger("530500452766");
            byte[] byteArray = x.toByteArray();
            String s = new String(byteArray);
            byteArray = s.getBytes();
            x = new BigInteger(byteArray);
        }
    
        // Rule 04, C
        public static void Rule04_C()
        {
            BigInteger x = new BigInteger("530500452766");
            String s = x.toString();  // Valid character data
            byte[] byteArray = s.getBytes();
            String ns = new String(byteArray);  
            x = new BigInteger(ns); 
        }
    
}