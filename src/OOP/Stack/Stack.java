package OOP.Stack;

import java.util.EmptyStackException;

interface Stack {
    void push(String item) throws FullStackException;
    String pop() throws EmptyStackException;
    String peek() throws EmptyStackException;
    boolean isEmpty();
}


