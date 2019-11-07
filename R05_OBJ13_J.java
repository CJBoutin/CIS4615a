public class R05_OBJ13_J
{
    // Non compliant
    public static final String [] SOMETHINGS_NC = { "ItemOne", "ItemTwo" };

    // Compliant
    private static final String [] SOMETHINGS_C = { "ItemOne", "ItemTwo" };
    
    public static final String [] somethings() {
        return SOMETHINGS_C.clone();
    }
}