import java.util.HashMap;

// Class NAPT (Network Address Port Translation) for translating IP addresses and ports
public class NAPT1 {

    // Initialize translationTable as a HashMap to store source and translated IP addresses and ports
    private HashMap<String, String> translationTable;

    // Constructor for NAPT class
    public NAPT() {
        translationTable = new HashMap<>();
    }

    // Method to translate source IP address and port to translated IP address and port
    // @param sourceIP Source IP address
    // @param sourcePort Source port
    // @param translatedIP Translated IP address
    // @param translatedPort Translated port
    public void translate(String sourceIP, int sourcePort, String translatedIP, int translatedPort) {
        // Create key by concatenating sourceIP and sourcePort
        String key = sourceIP + ":" + sourcePort;
        // Create value by concatenating translatedIP and translatedPort
        String value = translatedIP + ":" + translatedPort;
        // Add key-value pair to translationTable
        translationTable.put(key, value);
    }

    // Method to look up translated IP address and port for given source IP address and port
    // @param sourceIP Source IP address
    // @param sourcePort Source port
    // @return Translated IP address and port if found, otherwise "Translation not found"
    public String lookup(String sourceIP, int sourcePort) {
        // Create key by concatenating sourceIP and sourcePort
        String key = sourceIP + ":" + sourcePort;
        // Return value for key if found, otherwise "Translation not found"
        return translationTable.getOrDefault(key, "Translation not found");
    }

    // Main method for testing NAPT class
    public static void main(String[] args) {
        // Create instance of NAPT class
        NAPT napt = new NAPT();
        // Translate IP address and port
        napt.translate("192.168.1.1", 5000, "203.0.113.1", 80);
        // Look up translated IP address and port
        String translatedAddress = napt.lookup("192.168.1.1", 5000);
        // Print translated IP address and port
        System.out.println("Translated address: " + translatedAddress);
    }
}