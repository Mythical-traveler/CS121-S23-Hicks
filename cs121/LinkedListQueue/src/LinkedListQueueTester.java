import java.util.LinkedList;

public class LinkedListQueueTester {
    public static void main (String [] args){
        LinkedListQueue test=new LinkedListQueue();
        test.enqueue("Tom");
        test.enqueue("Jane");
        test.enqueue("Beth");
        test.enqueue("John");
        test.enqueue("Mary");
        String content=test.displayQueue();
        System.out.println(content);
        System.out.println("Queue is empty: "+test.isEmpty());
        System.out.println("Number of items in queue is: "+ test.size());
        System.out.println("The head of the queue is: "+test.peek());
        System.out.println("Remove item from list: "+test.dequeue());
        System.out.println("The head of the queue is: "+test.peek());
        System.out.println("Remove item from list: "+test.dequeue());
        System.out.println("The head of the queue is: "+test.peek());
        System.out.println("Remove item from list: "+test.dequeue());
        System.out.println("The head of the queue is: "+test.peek());
        System.out.println("Remove item from list: "+test.dequeue());
        System.out.println("The head of the queue is: "+test.peek());
        System.out.println("Remove item from list: "+test.dequeue());
        System.out.println("The head of the queue is: "+test.peek());
        System.out.println("Queue is empty: "+test.isEmpty());



    }
}
