import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class QueueToMap {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("One");
        queue.add("Two");
        queue.add("Three");

        Map<Integer, String> map = new HashMap<>();
        int i = 1;
        while (!queue.isEmpty()) {
            map.put(i++, queue.poll());
        }

        System.out.println("Map: " + map);
    }
}