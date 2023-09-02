package OOP.Stack;

import java.util.EmptyStackException;

public class ArrayStack implements Stack {
    private String[] stackData;
    private int buffor = 10;
    private int top = -1;
    public ArrayStack () {
        stackData = new String[buffor];
    }
    public void push (String object) throws FullStackException {
        if (top >= stackData.length -1) {
            throw new FullStackException();
        }
        top++;
        stackData[top] = object;
    }

    @Override
    public String pop() throws EmptyStackException {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        return stackData[top--];
    }

    @Override
    public String peek() throws EmptyStackException {
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
