/**
 * Implementation of Queue using ArrayList
 */

import java.util.ArrayList;

public class QueueUsingArrayList<T> {
    ArrayList<T> queueArray = new ArrayList<>();

    public boolean isEmpty() {
        return queueArray.size() == 0;
    }

    public void enqueue(T data) {
        queueArray.add(data);
    }

    public T dequeue() {
        if(!isEmpty()) {
            T data = queueArray.get(0);
            queueArray.remove( 0);
            return data;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
