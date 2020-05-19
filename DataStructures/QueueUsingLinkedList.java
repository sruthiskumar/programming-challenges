/**
 * Queue implementation using LinkedList
 */
public class QueueUsingLinkedList<T>  implements Iterable{
    private Node firstNode, lastNode;

    @Override
    public Iterator iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<T> {
        private Node current = firstNode;
        public boolean hasNext() {
            return current != null;
        }
        public T next() {
            T data = current.data;
            current = current.next;
            return data;
        }
    }

    class Node {
        Node next;
        T data;
    }

    public boolean isEmpty() {
        return firstNode == null;
    }

    public T dequeue() {
        T data = firstNode.data;
        firstNode = firstNode.next;
        if(isEmpty()) {
            lastNode = null;
        }
        return data;
    }

    public void enqueue(T data) {
        Node oldLast = lastNode;
        lastNode = new Node();
        lastNode.data = data;
        lastNode.next = null;
        if(isEmpty()) {
            firstNode = lastNode;
        } else {
            oldLast.next = lastNode;
        }
    }
}
