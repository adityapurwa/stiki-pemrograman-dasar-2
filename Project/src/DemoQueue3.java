import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class DemoQueue3 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(27, 30, 49, 80, 97, 3));
        queue.remove(); // 27
        queue.remove(); // 30
        queue.remove(); // 59
        queue.remove(); // 80
        queue.add(95);
        System.out.println(queue.peek());

        System.out.println(queue);
    }
}
