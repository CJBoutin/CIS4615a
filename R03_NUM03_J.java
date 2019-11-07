import java.io.DataInputStream;
import java.io.IOException;

public class R03_NUM03_J
{
        // Rule 03, NC
        public static int getInteger_NC(DataInputStream is) throws IOException {
            return is.readInt();  
        }
    
    
        // Rule 03, C
        public static long getInteger_C(DataInputStream is) throws IOException {
            return is.readInt() & 0xFFFFFFFFL; // Mask with 32 one-bits
        }    
}