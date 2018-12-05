import java.util.Stack;

public class ContohStack {
    public static void main(String[] args) {

        Stack st = new Stack();
        System.out.println("Stack : " + st);
        push(st, 5);
        push(st, 1);
        push(st, 4);

        pop(st);
        pop(st);
    }

    static void push(Stack st, int a) {
        st.push(a);
        System.out.println("Push " + a);
        System.out.println("Stack : " + st);
    }

    static void pop(Stack st) {
        if (st.isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Pop --> ");
            System.out.println(st.pop());
            System.out.println("Stack: " + st);
        }
    }
}
