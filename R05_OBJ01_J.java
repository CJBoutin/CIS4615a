public class R05_OBJ01_J
{
    // Non compliant
    public class Widget_NC {
        public int total; // Number of elements
       
        void add() {
          if (total < Integer.MAX_VALUE) {      
            total++;
            // ...
          } else {
            throw new ArithmeticException("Overflow");
          }
        }
       
        void remove() {  
          if (total > 0) {      
            total--;
            // ...
          } else {
            throw new ArithmeticException("Overflow");
          }
        }
    }

    // Compliant
    public class Widget_C {
        private int total; // Declared private
       
        public int getTotal () {
          return total;
        }
       
        // Definitions for add() and remove() remain the same
      }
}