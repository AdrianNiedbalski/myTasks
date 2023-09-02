package GenericStack;

import java.util.EmptyStackException;

class ArrayStack<T> {
    private T[] stackData;
    private int buffor = 10;
    private int top = -1;
    public ArrayStack() {
        stackData = (T[]) new Object [buffor];
    }

    public void push (T object) throws FullStackException {
        if (top >= stackData.length -1) {
            throw new FullStackException();
        }
        top++;
        stackData[top] = object;
    }

    public T pop() throws EmptyStackException {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        return stackData[top--];
    }

    public T peek() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stackData[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }

}


