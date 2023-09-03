package OOP.TaskAdnotacje;

import java.lang.reflect.Method;

public class Main{
    public static void main(String[] args) {
        Adnotacje myAdnotation = new Adnotacje();

        try {
            Method method = myAdnotation.getClass().getMethod("method");
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }


    }
}
