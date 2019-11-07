public class R00_IDS03_J
{
        // Rule 00, non compliant
        public static void Rule00_NC(boolean loginSuccessful) 
        {
            String username = "username";
            if (loginSuccessful) {
                System.out.println("User login succeeded for: " + username);
              } else {
                System.out.println("User login failed for: " + username);
              }
        }
    
        // Rule 00, compliant
        public static void Rule00_C(boolean loginSuccessful) 
        {
            String username = "username";
            if (loginSuccessful) {
                System.out.println("User login succeeded for: " + HelperMethods.SanitizeInput(username));
              } else {
                System.out.println("User login failed for: " + HelperMethods.SanitizeInput(username));
              }
        }
    
}