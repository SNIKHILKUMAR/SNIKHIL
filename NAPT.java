import java.util.HashMap;

public class NAPT {
    private HashMap<String, String> translationTable;

    public NAPT() {
        translationTable = new HashMap<>();
    }

    public void translate(String sourceIP, int sourcePort, String translatedIP, int translatedPort) {
        String key = sourceIP + ":" + sourcePort;
        String value = translatedIP + ":" + translatedPort;
        translationTable.put(key, value);
    }

    public String lookup(String sourceIP, int sourcePort) {
        String key = sourceIP + ":" + sourcePort;
        return translationTable.getOrDefault(key, "Translation not found");
    }

    public static void main(String[] args) {
        NAPT napt = new NAPT();
        napt.translate("192.168.1.1", 5000, "203.0.113.1", 80);
        
        String translatedAddress = napt.lookup("192.168.1.1", 5000);
        System.out.println("Translated address: " + translatedAddress);
    }
}