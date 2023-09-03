package OOP.TaskAdnotacje;

import java.lang.reflect.Method;

public class Main{
    public static void main(String[] args) {
        Adnotacje myAdnotation = new Adnotacje();

        try {
            Method method = myAdnotation.getClass().getMethod("method");
            if (method.isAnnotationPresent(SuperMethod.class)) {
                SuperMethod superMethod = method.getAnnotation(SuperMethod.class);

                System.out.println("Wartosc parametru run wynosi: " + superMethod.run());

            }
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }


    }
}
