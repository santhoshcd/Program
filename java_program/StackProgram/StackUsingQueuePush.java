import java.util.*;

class StackUsingQueuePush {

    static Queue<Integer> queue1 = new LinkedList<Integer>();
    static Queue<Integer> queue2 = new LinkedList<Integer>();
    static int curent_size;

    StackUsingQueuePush() {
      curent_size = 0;
    }

    public static Queue<Integer> getQueue1() {
      return queue1;
    }

    public void push(int element) {
      curent_size++;
      queue2.add(element);

      while (!queue1.isEmpty()) {
        queue2.add(queue1.peek());
        queue1.remove();
      }

      Queue<Integer> queue = queue1;
      queue1 = queue2;
      queue2 = queue;
    }


    public int pop() {
      if (queue1.isEmpty()) {
        return -1;
      }
      curent_size--;
      return queue1.remove();
    }

    public int top() {
      if (queue1.isEmpty()) {
        return -1;
      }
      return queue1.peek();
    }

    public int size() {
      return curent_size;
    }

    public static void main(String[] argas) {
      System.out.println(" Stack program : StackUsingQueuePush");
      StackUsingQueuePush s = new StackUsingQueuePush();
      s.push(1);
      s.push(2);
      s.push(3);

      System.out.println("current size: " + s.size());
      System.out.println(s.top());
      s.pop();
      System.out.println(s.top());
      s.pop();
      System.out.println(s.top());
      System.out.println("current size: " + s.size());
    }

}
