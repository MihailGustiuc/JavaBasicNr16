import java.util.HashMap;
import java.util.Map;

public class MapCopy {
    public static void main(String[] args) {
        Map<Integer, String> originalMap = new HashMap<>();
        originalMap.put(1, "One");
        originalMap.put(2, "Two");
        originalMap.put(3, "Three");

        Map<Integer, String> copiedMap = new HashMap<>(originalMap);
        System.out.println("Copied Map: " + copiedMap);
    }
}