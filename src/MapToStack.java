import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class MapToStack {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        Stack<String> stack = new Stack<>();
        stack.addAll(map.values());
        System.out.println("Stack: " + stack);
    }
}