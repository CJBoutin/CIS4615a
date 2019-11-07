public class R02_DCL00_J
{
    // Non compliant
    public static class Cycle_NC {
        private final int balance;
        private static final Cycle_NC c = new Cycle_NC();
        private static final int deposit = (int) (Math.random() * 100); // Random deposit
       
        public Cycle_NC() {
          balance = deposit - 10; // Subtract processing fee
        }

        public void Execute() {
            System.out.println("The account balance is: " + c.balance);
          }
    }

    // Compliant
    public static class Cycle_C {
        private final int balance;
        private static final int deposit = (int) (Math.random() * 100); // Random deposit
        private static final Cycle_C c = new Cycle_C();  // Inserted after initialization of required fields
        public Cycle_C() {
          balance = deposit - 10; // Subtract processing fee
        }
        public void Execute() {
            System.out.println("The account balance is: " + c.balance);
          }

    }
}