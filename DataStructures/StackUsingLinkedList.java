/**
 * Stack implementation using LinkedList
 */
public class StackUsingLinkedList<T>  {
    private Node firstNode = null;
    class Node {
        Node next;
        T data;
    }

    public boolean isEmpty() {
        return firstNode == null;
    }

    public T pop() {
        T data = firstNode.data;
        firstNode = firstNode.next;
        return data;
    }

    public T push(T data) {
        Node oldFirst = firstNode;
        Node first = new Node();
        first.data = data;
        first.next = oldFirst;
        return data;
    }

    public T peek() {
        return firstNode.data;
    }
}
