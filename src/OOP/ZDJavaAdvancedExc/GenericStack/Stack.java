package OOP.ZDJavaAdvancedExc.GenericStack;
import java.util.EmptyStackException;

public interface Stack<T> {
    void push(T item) throws FullStackException;
    T pop() throws EmptyStackException;
    T peek() throws EmptyStackException;
    boolean isEmpty();
}
