import java.util.*;

class StackUsingQueuePop {

  static Queue<Integer> queue1 = new LinkedList<Integer>();
  static Queue<Integer> queue2 = new LinkedList<Integer>();
  static int curent_size;

  StackUsingQueuePop() {
    curent_size = 0;
  }

  public static Queue<Integer> getQueue1() {
    return queue1;
  }

  public void push(int element) {
    curent_size++;
    queue1.add(element);

  }

  public int pop() {
    if (queue1.isEmpty()) {
      return -1;
    }
    while (queue1.size() != 1){
      queue2.add(queue1.peek());
      queue1.remove();
    }
    int q = queue1.remove();
    curent_size--;
    Queue<Integer> queue = queue1;
    queue1 = queue2;
    queue2 = queue;
    return q;
  }

  public int top() {
    if (queue1.isEmpty()) {
      return -1;
    }

    while (queue1.size() != 1){
      queue2.add(queue1.peek());
      queue1.remove();
    }
    int temp = queue1.peek();

    queue2.add(temp);

    Queue<Integer> queue = queue1;
    queue1 = queue2;
    queue2 = queue;
    return temp;
  }

  public int size() {
    return curent_size;
  }

  public static void main(String[] argas) {
    System.out.println(" Stack program : StackUsingQueuePop");
    StackUsingQueuePop s = new StackUsingQueuePop();
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
