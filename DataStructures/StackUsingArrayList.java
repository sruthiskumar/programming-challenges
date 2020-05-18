/**
 * Implementation of stack using ArrayList
 */

import java.util.ArrayList;

public class StackUsingArrayList<T> {
    ArrayList<T> stackArray = new ArrayList<>();
    int index = 0;

    public boolean isEmpty() {
        return stackArray.size() == 0;
    }

    public T push(T data) {
         stackArray.add(data);
         return data;
    }

    public T pop() {
        if(!isEmpty()) {
            T data = stackArray.get(stackArray.size() - 1);
            stackArray.remove(stackArray.size() - 1);
            return data;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public T peek() {
        return stackArray.get(stackArray.size()-1);
    }
}
