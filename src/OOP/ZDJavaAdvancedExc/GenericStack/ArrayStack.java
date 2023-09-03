package OOP.ZDJavaAdvancedExc.GenericStack;
import java.util.EmptyStackException;
class ArrayStack<T> implements Stack<T> {
    private T[] stackData;
    private int buffer = 10;
    private int top = -1;
    public ArrayStack() {
        stackData = (T[]) new Object [buffer];
    }
    @Override
    public void push (T object) throws FullStackException {
        if (top >= stackData.length -1) {
            throw new FullStackException();
        }
        top++;
        stackData[top] = object;
    }
    @Override
    public T pop() throws EmptyStackException {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        return stackData[top--];
    }
    @Override
    public T peek() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stackData[top];
    }
    @Override
    public boolean isEmpty() {
        return top == -1;
    }

}


